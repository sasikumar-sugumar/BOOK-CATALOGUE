/**
 * 
 */
package com.sskez.book.catalog.domain.isbn.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sskez.book.catalog.domain.isbn.client.CatalogDomainService;
import com.sskez.book.catalog.domain.isbn.client.ISBNService;
import com.sskez.book.catalog.domain.isbn.model.EntityRecord;
import com.sskez.book.catalog.domain.isbn.model.ISBNBookView;

/**
 * @author euro
 *
 */
@RestController
@RequestMapping("/ISBN")
public class ISBNManager {

	private static final Logger log = LoggerFactory.getLogger(ISBNManager.class);

	@Autowired
	ISBNService isbnService;

	@Autowired
	CatalogDomainService catalogDomainService;

	@RequestMapping(value = "/getBookList/{isbn}", method = RequestMethod.GET, consumes = { "application/json" })
	public @ResponseBody ISBNBookView getBookList(@PathVariable(value = "isbn") String isbn) {
		log.info("getBookList::Entry");
		try {
			EntityRecord entityRecord = catalogDomainService.getDocument(isbn);
			if (entityRecord == null) {
				log.info("Record not found in catalog :: looking up ISBN database");
				MultipartFile bookresponse = isbnService.getBooks(isbn);
				String bookDetailsAsString = IOUtils.toString(bookresponse.getInputStream(),
						StandardCharsets.UTF_8.name());
				log.debug("ISBN Service Response ::" + bookDetailsAsString);
				log.info("ISBN Service Response ::" + bookDetailsAsString);
				catalogDomainService.uploadDocument(new EntityRecord(isbn, bookDetailsAsString));
				  ISBNBookView isbnBookView = new ISBNBookView(isbn, bookDetailsAsString);
				log.info("getBookList::Exit");
				return isbnBookView;
			} else {
				log.info("Record found in catalog");
				log.info("getBookList::Exit");
				return new ISBNBookView(isbn, entityRecord.getPayloadAsJson());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

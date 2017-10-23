/**
 * 
 */
package com.sskez.book.catalog.domain.isbn.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sskez.book.catalog.domain.isbn.client.CatalogDomainService;
import com.sskez.book.catalog.domain.isbn.client.ISBNService;

/**
 * @author euro
 *
 */
@RestController
@RequestMapping("/ISBN")
public class ISBNManager {

	@Autowired
	ISBNService isbnService;
	
	@Autowired
	CatalogDomainService catalogDomainService;

	@RequestMapping(value = "/getBookList/{isbn}", method = RequestMethod.GET, consumes = { "application/json" })
	public ResponseEntity<InputStreamResource> getBookList(@PathVariable(value = "isbn") String isbn) {
		try {
			MultipartFile response = isbnService.getBooks(isbn);
			 ResponseEntity<InputStreamResource> responseEntity = ResponseEntity.ok().contentLength(response.getSize())
			.contentType(MediaType.parseMediaType(response.getContentType()))
			.body(new InputStreamResource(response.getInputStream()));
			catalogDomainService.uploadDocument(responseEntity.getBody());
			return responseEntity;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}

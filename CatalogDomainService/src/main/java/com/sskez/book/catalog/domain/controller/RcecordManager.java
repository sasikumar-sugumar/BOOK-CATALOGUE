/**
 * 
 */
package com.sskez.book.catalog.domain.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sskez.book.catalog.domain.model.EntityRecord;
import com.sskez.book.catalog.domain.service.RecordManagerService;

/**
 * @author euro
 *
 */
@RestController
@RequestMapping("/record")
public class RcecordManager {

	private static final Logger log = LoggerFactory.getLogger(RcecordManager.class);

	@Autowired
	private RecordManagerService recordManagerService;

	@RequestMapping(value = "/saveDocument", method = RequestMethod.POST, consumes = { "application/json" })
	public EntityRecord saveDocument(@RequestBody EntityRecord entityRecord) {
		log.info("saveDocument::Entry");
		EntityRecord entityRecordCreated = recordManagerService.createRecord(entityRecord);
		log.info("saveDocument::Exit");
		return entityRecordCreated;
	}

	@RequestMapping(value = "/uploadDocument", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public EntityRecord uploadDocument(@RequestBody EntityRecord entityRecord) {
		log.info("uploadDocument::Entry");
		EntityRecord entityRecordCreated = recordManagerService.createRecord(entityRecord);
		log.info("uploadDocument::Exit");
		return entityRecordCreated;
	}

	@RequestMapping(value = "/getDocument", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public EntityRecord getDocument(@RequestParam(value = "isbnCode") String isbnCode) {
		log.info("getDocument::Entry");
		EntityRecord entityRecordCreated = recordManagerService.getEntityByISBN(isbnCode);
		log.info("getDocument::Exit");
		return entityRecordCreated;
	}

	@RequestMapping(value = "/getIdentifier", method = RequestMethod.GET, produces = { "application/json" })
	public UUID getIdentifier() {
		log.info("getIdentifier::Entry");
		UUID generatedUUID = UUID.randomUUID();
		log.info("getIdentifier::Exit");
		return generatedUUID;

	}

}

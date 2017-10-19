/**
 * 
 */
package com.sskez.book.catalog.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sskez.book.catalog.domain.model.EntityRecord;
import com.sskez.book.catalog.domain.service.RecordManagerService;

/**
 * @author euro
 *
 */
@RestController
public class RcecordManager {

	@Autowired
	private RecordManagerService recordManagerService;

	@RequestMapping(name = "/saveDocument", method = RequestMethod.POST, consumes = { "application/json" })
	public EntityRecord saveDocument(@RequestBody EntityRecord entityRecord) {

		recordManagerService.createRecord(entityRecord);

		return entityRecord;

	}

}

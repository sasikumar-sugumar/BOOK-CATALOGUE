/**
 * 
 */
package com.sskez.book.catalog.domain.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sskez.book.catalog.domain.dao.RecordManagerDAO;
import com.sskez.book.catalog.domain.model.EntityRecord;
import com.sskez.book.catalog.domain.service.RecordManagerService;

/**
 * @author euro
 *
 */
@Service
public class RecordManagerServiceIpml implements RecordManagerService {
	
	 private static final Logger log = LoggerFactory.getLogger(RecordManagerServiceIpml.class);
	
	@Autowired
	private RecordManagerDAO recordManagerDAO;

	@Override
	public EntityRecord createRecord(EntityRecord entityRecord) {
		log.debug("createRecord ##" + entityRecord);
		return recordManagerDAO.save(entityRecord);
	}
	
	@Override
	public EntityRecord getEntityByISBN(String isbnCode) {
		log.debug("getEntityByISBN ##" + isbnCode);
		return recordManagerDAO.findOne(isbnCode);
	}

}

/**
 * 
 */
package com.sskez.book.catalog.domain.service.impl;

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
	
	@Autowired
	private RecordManagerDAO recordManagerDAO;

	@Override
	public boolean createRecord(EntityRecord entityRecord) {
		recordManagerDAO.save(entityRecord);
		
		return true;
	}

}

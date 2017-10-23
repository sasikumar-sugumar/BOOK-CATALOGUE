/**
 * 
 */
package com.sskez.book.catalog.domain.service;

import com.sskez.book.catalog.domain.model.EntityRecord;

/**
 * @author euro
 *
 */
public interface RecordManagerService {
	
 EntityRecord createRecord(EntityRecord entityRecord);
	
	EntityRecord getEntityByISBN(String isbnCode);
	

}

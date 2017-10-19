/**
 * 
 */
package com.sskez.book.catalog.domain.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sskez.book.catalog.domain.model.EntityRecord;

/**
 * @author euro
 *
 */
public interface RecordManagerDAO extends MongoRepository<EntityRecord, String>  {

}

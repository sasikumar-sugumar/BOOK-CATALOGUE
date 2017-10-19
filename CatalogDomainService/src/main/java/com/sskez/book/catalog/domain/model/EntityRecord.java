/**
 * 
 */
package com.sskez.book.catalog.domain.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.mongodb.DBObject;

/**
 * @author euro
 *
 */
public class EntityRecord {

	@Id
	private String id;

	private String uuid;
	private DBObject payload;
	private String deviceid;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date createdDate = new Date();

	public EntityRecord() {
	}

	public EntityRecord(String id, String uuid, DBObject payload, String deviceid, Date createdDate) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.payload = payload;
		this.deviceid = deviceid;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, uuid='%s', deviceid='%s']", id, uuid, deviceid);
	}

}

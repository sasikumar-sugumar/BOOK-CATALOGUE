/**
 * 
 */
package com.sskez.book.catalog.domain.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

/**
 * @author euro
 *
 */
public class EntityRecord {

	@Id
	private String id;

	private String isbnCode;
	
	private String payloadAsJson;
	
	private DBObject payload;
	
	private String deviceid;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date createdDate = new Date();

	public EntityRecord() {
	}

	public EntityRecord(String isbnCode,String payloadAsJson) {
		try {
			this.id = UUID.randomUUID().toString();
			this.isbnCode = isbnCode;
			this.payloadAsJson = payloadAsJson;
			//this.payload = (DBObject)JSON.parse(IOUtils.toString(inputStreamResource.getInputStream(), StandardCharsets.UTF_8.name())) ;
			this.payload = (DBObject)JSON.parse(payloadAsJson) ;
			//this.deviceid = deviceid;
			//this.createdDate = createdDate;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public EntityRecord(String id, String isbnCode, DBObject payload, String deviceid, Date createdDate) {
		super();
		this.id = id;
		this.isbnCode = isbnCode;
		this.payload = payload;
		this.deviceid = deviceid;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, uuid='%s', payload='%s']", id, isbnCode, payload);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public DBObject getPayload() {
		return payload;
	}

	public void setPayload(DBObject payload) {
		this.payload = payload;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public String getPayloadAsJson() {
		return payloadAsJson;
	}

	public void setPayloadAsJson(String payloadAsJson) {
		this.payloadAsJson = payloadAsJson;
		this.payload = (DBObject)JSON.parse(payloadAsJson) ;
	}
	
	

}

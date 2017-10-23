package com.sskez.book.catalog.domain.isbn.model;

public class EntityRecord {

	private String isbnCode;
	private String payloadAsJson;

	public EntityRecord(String isbnCode, String payloadAsJson) {
		super();
		this.isbnCode = isbnCode;
		this.payloadAsJson = payloadAsJson;
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
	}

}

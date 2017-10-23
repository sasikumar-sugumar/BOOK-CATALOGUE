/**
 * 
 */
package com.sskez.book.catalog.domain.isbn.model;

import org.json.JSONException;

import com.mongodb.util.JSON;

/**
 * @author euro
 *
 */
public class ISBNBookView {

	private String isbnCode;

	private Object payload;

	public ISBNBookView() {
		super();
	}

	public ISBNBookView(String isbnCode, String payload) {
		super();
		try {
			this.isbnCode = isbnCode;
			this.payload =  JSON.parse(payload);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //(DBObject) JSON.parse(payload);
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

}

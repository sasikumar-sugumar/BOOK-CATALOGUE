package com.sskez.book.catalog.domain.isbn.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "publisher_name", "title_long", "isbn13", "book_id", "title", "lcc_number", "dewey_normal",
		"marc_enc_level", "dewey_decimal", "urls_text", "physical_description_text", "publisher_text", "isbn10",
		"author_data", "summary", "title_latin", "publisher_id", "edition_info", "awards_text", "language",
		"subject_ids", "notes" })
public class RecordData {

	@JsonProperty("publisher_name")
	private String publisherName;
	@JsonProperty("title_long")
	private String titleLong;
	@JsonProperty("isbn13")
	private String isbn13;
	@JsonProperty("book_id")
	private String bookId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("lcc_number")
	private String lccNumber;
	@JsonProperty("dewey_normal")
	private String deweyNormal;
	@JsonProperty("marc_enc_level")
	private String marcEncLevel;
	@JsonProperty("dewey_decimal")
	private String deweyDecimal;
	@JsonProperty("urls_text")
	private String urlsText;
	@JsonProperty("physical_description_text")
	private String physicalDescriptionText;
	@JsonProperty("publisher_text")
	private String publisherText;
	@JsonProperty("isbn10")
	private String isbn10;
	@JsonProperty("author_data")
	private String authorData;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("title_latin")
	private String titleLatin;
	@JsonProperty("publisher_id")
	private String publisherId;
	@JsonProperty("edition_info")
	private String editionInfo;
	@JsonProperty("awards_text")
	private String awardsText;
	@JsonProperty("language")
	private String language;
	@JsonProperty("subject_ids")
	private String subjectIds;
	@JsonProperty("notes")
	private String notes;
	@JsonIgnore
	private Map<String, String> additionalProperties = new HashMap<String, String>();

	@JsonProperty("publisher_name")
	public String getPublisherName() {
		return publisherName;
	}

	@JsonProperty("publisher_name")
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@JsonProperty("title_long")
	public String getTitleLong() {
		return titleLong;
	}

	@JsonProperty("title_long")
	public void setTitleLong(String titleLong) {
		this.titleLong = titleLong;
	}

	@JsonProperty("isbn13")
	public String getIsbn13() {
		return isbn13;
	}

	@JsonProperty("isbn13")
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	@JsonProperty("book_id")
	public String getBookId() {
		return bookId;
	}

	@JsonProperty("book_id")
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("lcc_number")
	public String getLccNumber() {
		return lccNumber;
	}

	@JsonProperty("lcc_number")
	public void setLccNumber(String lccNumber) {
		this.lccNumber = lccNumber;
	}

	@JsonProperty("dewey_normal")
	public String getDeweyNormal() {
		return deweyNormal;
	}

	@JsonProperty("dewey_normal")
	public void setDeweyNormal(String deweyNormal) {
		this.deweyNormal = deweyNormal;
	}

	@JsonProperty("marc_enc_level")
	public String getMarcEncLevel() {
		return marcEncLevel;
	}

	@JsonProperty("marc_enc_level")
	public void setMarcEncLevel(String marcEncLevel) {
		this.marcEncLevel = marcEncLevel;
	}

	@JsonProperty("dewey_decimal")
	public String getDeweyDecimal() {
		return deweyDecimal;
	}

	@JsonProperty("dewey_decimal")
	public void setDeweyDecimal(String deweyDecimal) {
		this.deweyDecimal = deweyDecimal;
	}

	@JsonProperty("urls_text")
	public String getUrlsText() {
		return urlsText;
	}

	@JsonProperty("urls_text")
	public void setUrlsText(String urlsText) {
		this.urlsText = urlsText;
	}

	@JsonProperty("physical_description_text")
	public String getPhysicalDescriptionText() {
		return physicalDescriptionText;
	}

	@JsonProperty("physical_description_text")
	public void setPhysicalDescriptionText(String physicalDescriptionText) {
		this.physicalDescriptionText = physicalDescriptionText;
	}

	@JsonProperty("publisher_text")
	public String getPublisherText() {
		return publisherText;
	}

	@JsonProperty("publisher_text")
	public void setPublisherText(String publisherText) {
		this.publisherText = publisherText;
	}

	@JsonProperty("isbn10")
	public String getIsbn10() {
		return isbn10;
	}

	@JsonProperty("isbn10")
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	@JsonProperty("author_data")
	public String getAuthorData() {
		return authorData;
	}

	@JsonProperty("author_data")
	public void setAuthorData(String authorData) {
		this.authorData = authorData;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@JsonProperty("title_latin")
	public String getTitleLatin() {
		return titleLatin;
	}

	@JsonProperty("title_latin")
	public void setTitleLatin(String titleLatin) {
		this.titleLatin = titleLatin;
	}

	@JsonProperty("publisher_id")
	public String getPublisherId() {
		return publisherId;
	}

	@JsonProperty("publisher_id")
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	@JsonProperty("edition_info")
	public String getEditionInfo() {
		return editionInfo;
	}

	@JsonProperty("edition_info")
	public void setEditionInfo(String editionInfo) {
		this.editionInfo = editionInfo;
	}

	@JsonProperty("awards_text")
	public String getAwardsText() {
		return awardsText;
	}

	@JsonProperty("awards_text")
	public void setAwardsText(String awardsText) {
		this.awardsText = awardsText;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	@JsonProperty("subject_ids")
	public String getSubjectIds() {
		return subjectIds;
	}

	@JsonProperty("subject_ids")
	public void setSubjectIds(String subjectIds) {
		this.subjectIds = subjectIds;
	}

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonAnyGetter
	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

}
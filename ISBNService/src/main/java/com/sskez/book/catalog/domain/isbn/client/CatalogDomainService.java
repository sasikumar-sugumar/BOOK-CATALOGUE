package com.sskez.book.catalog.domain.isbn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sskez.book.catalog.domain.isbn.model.EntityRecord;

@FeignClient(name = "CATALOG-DOMAIN-SERVICE", url = "http://localhost:8089/record", configuration = ISBNServiceConfiguration.class)
public interface CatalogDomainService {

	@RequestMapping(value = "/uploadDocument", method = RequestMethod.POST)
	@ResponseBody
	Object uploadDocument(@RequestBody EntityRecord inputResource);

	@RequestMapping(value = "/getDocument", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	EntityRecord getDocument(@RequestParam("isbnCode") String isbnCode);

}

package com.sskez.book.catalog.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CatalogDomainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogDomainServiceApplication.class, args);
	}

	
	  @Bean
	    public Docket documentation() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                    .apis(RequestHandlerSelectors.any())
	                    .paths(PathSelectors.any())
	                    // .paths(regex("/api/*"))
	                    .build()
	               // .pathMapping("/api")
	                .apiInfo(metadata());
	    }

	    private ApiInfo metadata() {
	        return new ApiInfoBuilder()
	                .title("sabi's REST API documentation")
	                .description("see https://github.com/StefanSchubert/sabi")
	                .version("1.0")
	                .license("MIT Licence (MIT)")
	                .licenseUrl("https://github.com/StefanSchubert/sabi/blob/master/LICENSE")
	                .contact("Stefan.Schubert@bluewhale.de")
	                .build();
	    }
	 
	
}

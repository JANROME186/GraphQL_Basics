package com.example.demo;

import com.example.demo.model.DescriptiveCatalog;
import com.example.demo.model.LegendCatalog;
import graphql.kickstart.tools.SchemaParserDictionary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	class GraphQLConfig{
		@Bean
		SchemaParserDictionary schemaParserDictionary(){
			return new SchemaParserDictionary().add(DescriptiveCatalog.class)
					.add(LegendCatalog.class);
		}
	}

}

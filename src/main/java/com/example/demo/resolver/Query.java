package com.example.demo.resolver;

import com.example.demo.pojo.Catalog;
import com.example.demo.pojo.CatalogValues;
import com.example.demo.pojo.Metadata;
import com.example.demo.services.ICatalogService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    ICatalogService catalogService;

    public List<CatalogValues> catalogs(Catalog catalogo){
        log.info("Retrieving catalog by id: {}", catalogo);
        return this.catalogService.getGatalog(catalogo);
    }

    public Metadata metadata(Catalog catalogo){
        log.info("Retrieving catalog metadata by id: {}", catalogo);
        return this.catalogService.getMetadata(catalogo);
    }

}

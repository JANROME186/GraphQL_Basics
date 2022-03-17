package com.example.demo.resolver;

import com.example.demo.context.CustomGraphQLContext;
import com.example.demo.pojo.Catalog;
import com.example.demo.pojo.CatalogValues;
import com.example.demo.pojo.Metadata;
import com.example.demo.services.ICatalogService;
import graphql.kickstart.servlet.context.GraphQLServletContext;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    ICatalogService catalogService;

    public List<CatalogValues> catalogs(Catalog param, DataFetchingEnvironment env){
        log.info("Retrieving catalog by id: {}", param);
        CustomGraphQLContext context =  env.getContext();
        log.info(context.getUUID());
        return this.catalogService.getGatalog(param);
    }

    public Metadata metadata(Catalog param, DataFetchingEnvironment env){
        log.info("Retrieving catalog metadata by id: {}", param);
        return this.catalogService.getMetadata(param);
    }

}

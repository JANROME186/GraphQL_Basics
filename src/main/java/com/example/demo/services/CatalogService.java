package com.example.demo.services;

import com.example.demo.interfaces.IBuilderFunction;
import com.example.demo.pojo.Catalog;
import com.example.demo.pojo.Metadata;
import com.example.demo.repository.DescriptiveCatalogRepository;
import com.example.demo.repository.LegendCatalogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CatalogService implements ICatalogService, IBuilderFunction {

    @Autowired
    DescriptiveCatalogRepository descriptiveCatalogRepository;

    @Autowired
    LegendCatalogRepository legendCatalogRepository;


    @Override
    public List getGatalog(Catalog catalog) {
        List result = new ArrayList<>();
        switch (catalog.getCatalogId()){
            case "D000011":
                result.add(this.getDescriptiveCatalog("20220314","001","","test","test","test","test"));
                break;
            case "L000036":
                result.add(this.getLegendCatalog("20220313","test","tester",null, "test"));
                break;
            case "L000037":
                result.add(this.getLegendCatalog("20220314","test",null,"desarrollo", "test"));
                break;
        }
        return result;
    }

    @Override
    public Metadata getMetadata(Catalog catalog){
        Metadata result = new Metadata();
        result.setCatalogId(catalog.getCatalogId());
        result.setColumns(new ArrayList<>());
        switch (catalog.getCatalogId()){
            case "D000011":
                result.getColumns().add("processDate");
                result.getColumns().add("id");
                result.getColumns().add("relCatId");
                result.getColumns().add("fullDesc");
                result.getColumns().add("shortDesc");
                result.getColumns().add("screenDesc");
                result.getColumns().add("abbreviation");
                break;
            case "L000036":
                result.getColumns().add("processDate");
                result.getColumns().add("palabra");
                result.getColumns().add("ocupaci");
                result.getColumns().add("descrip");
                break;
            case "L000037":
                result.getColumns().add("processDate");
                result.getColumns().add("palabra");
                result.getColumns().add("actividad");
                result.getColumns().add("descrip");
                break;
        }
        return result;
    }
}

package com.example.demo.interfaces;

import com.example.demo.model.DescriptiveCatalog;
import com.example.demo.model.LegendCatalog;

public interface IBuilderFunction{

    default DescriptiveCatalog getDescriptiveCatalog(
            String processDate, String id, String relCatId,
            String fullDesc, String shotDesc, String screenDesc, String abbreviation){
        return DescriptiveCatalog.builder().processDate(processDate).id(id)
                .relCatId(relCatId).fullDesc(fullDesc).shotDesc(shotDesc)
                .screenDesc(screenDesc).abbreviation(abbreviation).build();
    }

    default LegendCatalog getLegendCatalog(
            String processDate, String palabra, String ocupaci, String activid, String descrip){
        return LegendCatalog.builder().processDate(processDate)
                .palabra(palabra).ocupaci(ocupaci).activid(activid).descrip(descrip).build();
    }
}

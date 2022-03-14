package com.example.demo.model;

import com.example.demo.pojo.CatalogValues;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DescriptiveCatalog extends CatalogValues {

    @Id
    @Getter
    @Setter
    private String processDate;

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String relCatId;

    @Getter
    @Setter
    private String fullDesc;

    @Getter
    @Setter
    private String shotDesc;

    @Getter
    @Setter
    private String screenDesc;

    @Getter
    @Setter
    private String abbreviation;
}

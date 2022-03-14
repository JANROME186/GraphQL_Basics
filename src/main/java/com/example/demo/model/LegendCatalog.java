package com.example.demo.model;

import com.example.demo.pojo.CatalogValues;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendCatalog  extends CatalogValues {

    @Id
    private String processDate;
    private String palabra;
    private String ocupaci;
    private String activid;
    private String descrip;
}

package com.example.demo.services;

import com.example.demo.pojo.Catalog;
import com.example.demo.pojo.CatalogValues;
import com.example.demo.pojo.Metadata;

import java.util.List;

public interface ICatalogService {

    List<CatalogValues> getGatalog(Catalog catalog);
    Metadata getMetadata(Catalog catalog);
}

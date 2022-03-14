package com.example.demo.repository;

import com.example.demo.model.LegendCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegendCatalogRepository extends JpaRepository<LegendCatalog, String> {
}

package com.example.demo.repository;

import com.example.demo.model.DescriptiveCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptiveCatalogRepository extends JpaRepository<DescriptiveCatalog, String> {
}

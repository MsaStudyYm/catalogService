package com.catalogservice.catalogservice.service;

import com.catalogservice.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

package org.project.pos.projectpos.product.service;

import org.project.pos.projectpos.product.model.ProductRequest;
import org.project.pos.projectpos.product.model.ProductResponse;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductResponse> get();
    Optional<ProductResponse> getById(String id);
    Optional<ProductResponse> save(ProductRequest request);
    Optional<ProductResponse> update(ProductRequest request, String id);
    Optional<ProductResponse> delete(String id);
}

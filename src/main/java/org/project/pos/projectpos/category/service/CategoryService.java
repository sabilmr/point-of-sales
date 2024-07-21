package org.project.pos.projectpos.category.service;

import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryResponse> get();
    Optional<CategoryResponse> getById(String id);
    Optional<CategoryResponse> save(CategoryRequest request);
    Optional<CategoryResponse> update(CategoryRequest request, String id);
    Optional<CategoryResponse> delete(String id);
}

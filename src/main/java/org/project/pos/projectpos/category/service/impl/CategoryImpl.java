package org.project.pos.projectpos.category.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryImpl implements CategoryService {
    private final List<CategoryResponse> categories;

    public CategoryImpl() {
        categories = new ArrayList<>();
    }

    @Override
    public List<CategoryResponse> get() {
        List<CategoryResponse> categoryResponses = new ArrayList<>();
        categoryResponses.add(new CategoryResponse("1234", "Makanan", 1234, 12345));
        categoryResponses.add(new CategoryResponse("1234", "Minuman", 1234, 12345));
        categoryResponses.add(new CategoryResponse("1234", "Electronic", 1234, 12345));
        categoryResponses.add(new CategoryResponse("1234", "Otomotif", 1234, 12345));
        if (categories.isEmpty()){
            categories.addAll(categoryResponses);
        }
        return categories;
    }


    @Override
    public Optional<CategoryResponse> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoryResponse> save(CategoryRequest request) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoryResponse> update(CategoryRequest request, String id) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoryResponse> delete(String id) {
        return Optional.empty();
    }
}

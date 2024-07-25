package org.project.pos.projectpos.category.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.repository.CategoryRepo;
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
    private final CategoryRepo repo;

    @Override
    public List<CategoryResponse> get() {
        return repo.findAll().stream()
                .map(CategoryResponse::new)
                .collect(Collectors.toList());
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

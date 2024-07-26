package org.project.pos.projectpos.category.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.repository.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
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

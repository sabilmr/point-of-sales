package org.project.pos.projectpos.category.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.category.model.CategoryEntity;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.repository.CategoryRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
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
        if (request == null) {
            return Optional.empty();
        }

        CategoryEntity categoryEntity = new CategoryEntity();
        BeanUtils.copyProperties(request, categoryEntity);
        categoryEntity.setId(UUID.randomUUID().toString());
        try {
            repo.save(categoryEntity);
            log.info("Category saved successfully");
            return Optional.of(new CategoryResponse(categoryEntity));
        } catch (Exception e) {
            log.error("Save category failed, error: {}", e.getMessage());
            return Optional.empty();
        }
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

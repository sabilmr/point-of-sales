package org.project.pos.projectpos.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.product.model.ProductRequest;
import org.project.pos.projectpos.product.model.ProductResponse;
import org.project.pos.projectpos.product.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepo repo;

    @Override
    public List<ProductResponse> get() {
        return repo.findAll().stream()
                .map(ProductResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductResponse> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductResponse> save(ProductRequest request) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductResponse> update(ProductRequest request, String id) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductResponse> delete(String id) {
        return Optional.empty();
    }
}

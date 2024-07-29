package org.project.pos.projectpos.customer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.customer.modal.CustomerRequest;
import org.project.pos.projectpos.customer.modal.CustomerResponse;
import org.project.pos.projectpos.customer.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    @Override
    public List<CustomerResponse> get() {
        return customerRepo.findAll().stream()
                .map(CustomerResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerResponse> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerResponse> save(CustomerRequest request) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerResponse> update(CustomerRequest request, String id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerResponse> delete(String id) {
        return Optional.empty();
    }
}

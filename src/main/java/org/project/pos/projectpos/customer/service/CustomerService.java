package org.project.pos.projectpos.customer.service;

import org.project.pos.projectpos.customer.modal.CustomerRequest;
import org.project.pos.projectpos.customer.modal.CustomerResponse;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerResponse> get();
    Optional<CustomerResponse> getById(String id);
    Optional<CustomerResponse> save(CustomerRequest request);
    Optional<CustomerResponse> update(CustomerRequest request, String id);
    Optional<CustomerResponse> delete(String id);
}

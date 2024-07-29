package org.project.pos.projectpos.customer.repository;

import org.project.pos.projectpos.customer.modal.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
}

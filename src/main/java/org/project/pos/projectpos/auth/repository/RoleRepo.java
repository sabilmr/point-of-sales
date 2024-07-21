package org.project.pos.projectpos.auth.repository;

import org.project.pos.projectpos.auth.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepo extends JpaRepository<RoleEntity, String> {
    Optional<RoleEntity> findByName(String name);
    List<RoleEntity> findByNameIn(List<String> roles);
}

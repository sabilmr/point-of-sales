package org.project.pos.projectpos.category.repository;

import org.project.pos.projectpos.category.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, String> {
}

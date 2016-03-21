package com.guitar.db.repository;

import com.guitar.db.model.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MaBa on 21/03/16.
 */
public interface ModelTypeJpaRepository extends JpaRepository<ModelType, Long> {
}

package com.guitar.db.repository;

import com.guitar.db.model.Manufacturer;
import com.guitar.db.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MaBa on 21/03/16.
 */
@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {
}

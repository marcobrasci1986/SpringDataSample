package com.guitar.db.repository;

import com.guitar.db.model.Manufacturer;
import com.guitar.db.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {

    List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual
            (BigDecimal low , BigDecimal high);
}

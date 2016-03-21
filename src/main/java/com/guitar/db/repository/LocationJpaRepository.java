package com.guitar.db.repository;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MaBa on 21/03/16.
 */
@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
}

package com.guitar.db.repository;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MaBa on 21/03/16.
 */
@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

    List<Location> findByStateLike(String stateName);

    List<Location> findByStateOrCountry(String state, String country);

    List<Location> findByStateAndCountry(String state, String country);
}

package com.personal.projects.footballstats_server.repositories;

import com.personal.projects.footballstats_server.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryModel, Long> {

    @Query(value = "SELECT u FROM CountryModel u WHERE u.name = :name")
    CountryModel getCountryModelByName(@Param("name") String name);
}

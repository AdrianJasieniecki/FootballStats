package com.personal.projects.footballstats_server.repositories;

import com.personal.projects.footballstats_server.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryModel, Long> {
}

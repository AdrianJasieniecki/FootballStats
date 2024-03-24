package com.personal.projects.footballstats_server.repositories;

import com.personal.projects.footballstats_server.models.VenueModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<VenueModel, Long> {
}

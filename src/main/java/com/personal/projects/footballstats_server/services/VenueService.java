package com.personal.projects.footballstats_server.services;

import com.personal.projects.footballstats_server.models.VenueModel;
import com.personal.projects.footballstats_server.repositories.VenueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {

    Logger logger = LoggerFactory.getLogger(VenueService.class);

    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public List<VenueModel> getAllVenues() {
        logger.debug("Getting all venues");
        return venueRepository.findAll();
    }

    public VenueModel getVenueById(Long id) {
        if (venueRepository.existsById(id)) {
            logger.debug("Getting venue for id = " + id);
            return venueRepository.getReferenceById(id);
        } else return null;
    }

    public VenueModel addNewVenue(VenueModel venueModel) {
        if (!venueRepository.existsById(venueModel.getId())) {
            logger.debug("Adding new venue = " + venueModel);
            return venueRepository.save(venueModel);
        } else return null;
    }

    public VenueModel updateVenue(VenueModel venueModel) {
        if (venueRepository.existsById(venueModel.getId())) {
            logger.debug("Updating venue = " + venueModel);
            return venueRepository.save(venueModel);
        } else return null;
    }

    public boolean deleteVenueById(Long id) {
        if (venueRepository.existsById(id)) {
            logger.debug("Deleting venue for id = " + id);
            venueRepository.deleteById(id);
            return true;
        } else return false;
    }
}

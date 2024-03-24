package com.personal.projects.footballstats_server.services;

import com.personal.projects.footballstats_server.models.LeagueModel;
import com.personal.projects.footballstats_server.repositories.LeagueRepository;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {

    Logger logger = LoggerFactory.getLogger(LeagueService.class);
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        logger.debug("Creating league service");
        this.leagueRepository = leagueRepository;
    }

    public List<LeagueModel> getAllLeagues() {
        logger.debug("Getting all leagues");
        return leagueRepository.findAll();
    }

    public LeagueModel getLeagueById(Long id) {
        if (leagueRepository.existsById(id)) {
            logger.debug("Getting league for id = " + id);
            return leagueRepository.getReferenceById(id);
        }else return null;
    }

    public LeagueModel addNewLeague(LeagueModel leagueModel) {
        if (!leagueRepository.existsById(leagueModel.getId())) {
            logger.debug("Adding new league = " + leagueModel);
            return leagueRepository.save(leagueModel);
        }else return null;
    }

    public LeagueModel updateLeague(LeagueModel leagueModel) {
        if (leagueRepository.existsById(leagueModel.getId())) {
            logger.debug("Updating league = " + leagueModel);
            return leagueRepository.save(leagueModel);
        } else return null;
    }

    public boolean deleteLeagueById(Long id) {
        if (leagueRepository.existsById(id)) {
            logger.debug("Deleting league for id = " + id);
            leagueRepository.deleteById(id);
            return true;
        } else return false;
    }
}

package com.personal.projects.footballstats_server.services;

import com.personal.projects.footballstats_server.models.TeamModel;
import com.personal.projects.footballstats_server.repositories.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    Logger logger = LoggerFactory.getLogger(TeamService.class);

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamModel> getAllTeams() {
        logger.debug("Getting all teams");
        return teamRepository.findAll();
    }

    public TeamModel getTeamById(Long id) {
        if (teamRepository.existsById(id)) {
            logger.debug("Getting team for id = " + id);
            return teamRepository.getReferenceById(id);
        } else return null;
    }

    public TeamModel addNewTeam(TeamModel teamModel) {
        if (!teamRepository.existsById(teamModel.getId())) {
            logger.debug("Adding new team = " + teamModel);
            return teamRepository.save(teamModel);
        } else return null;
    }

    public TeamModel updateTeam(TeamModel teamModel) {
        if (teamRepository.existsById(teamModel.getId())) {
            logger.debug("Updating team = " + teamModel);
            return teamRepository.save(teamModel);
        } else return null;
    }

    public boolean deleteTeamById(Long id) {
        if (teamRepository.existsById(id)) {
            logger.debug("Deleting team for id = " + id);
            teamRepository.deleteById(id);
            return true;
        } else return false;
    }
}

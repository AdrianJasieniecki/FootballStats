package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.FixturesDTO;
import com.personal.projects.footballstats_server.dtos.GoalsDTO;
import com.personal.projects.footballstats_server.dtos.StatisticsDTO;
import com.personal.projects.footballstats_server.dtos.TeamDTO;
import com.personal.projects.footballstats_server.models.FixturesModel;
import com.personal.projects.footballstats_server.models.GoalsModel;
import com.personal.projects.footballstats_server.models.StatisticsModel;
import com.personal.projects.footballstats_server.models.TeamModel;

public class StatisticsMapper extends AbstractMapper<StatisticsDTO, StatisticsModel>{
    @Override
    public StatisticsModel toEntity(StatisticsDTO statisticsDTO) {
        TeamModel team = new TeamMapper().toEntity(statisticsDTO.getTeamDTO());
        FixturesModel fixtures = new FixturesMapper().toEntity(statisticsDTO.getFixturesDTO());
        GoalsModel goals = new GoalsMapper().toEntity(statisticsDTO.getGoalsDTO());
        return new StatisticsModel()
                .setForm(statisticsDTO.getForm())
                .setFixtures(fixtures)
                .setGoals(goals)
                .setTotalCleanSheets(statisticsDTO.getTotalCleanSheets())
                .setHomeCleanSheets(statisticsDTO.getHomeCleanSheets())
                .setAwayCleanSheets(statisticsDTO.getAwayCleanSheets())
                .setTotalPenalties(statisticsDTO.getTotalPenalties())
                .setScoredPenalties(statisticsDTO.getScoredPenalties())
                .setMissedPenalties(statisticsDTO.getMissedPenalties())
                .setYellowCards(statisticsDTO.getYellowCards())
                .setRedCards(statisticsDTO.getRedCards())
                .setAverageYellowCardsPerGame(statisticsDTO.getAverageYellowCardsPerGame())
                .setAverageRedCardsPerGame(statisticsDTO.getAverageRedCardsPerGame())
                .setTeam(team);
    }

    @Override
    public StatisticsDTO toDTO(StatisticsModel statisticsModel) {
        TeamDTO team = new TeamMapper().toDTO(statisticsModel.getTeam());
        FixturesDTO fixtures = new FixturesMapper().toDTO(statisticsModel.getFixtures());
        GoalsDTO goals = new GoalsMapper().toDTO(statisticsModel.getGoals());
        return new StatisticsDTO()
                .setId(statisticsModel.getId())
                .setForm(statisticsModel.getForm())
                .setFixturesDTO(fixtures)
                .setGoalsDTO(goals)
                .setTotalCleanSheets(statisticsModel.getTotalCleanSheets())
                .setHomeCleanSheets(statisticsModel.getHomeCleanSheets())
                .setAwayCleanSheets(statisticsModel.getAwayCleanSheets())
                .setTotalPenalties(statisticsModel.getTotalPenalties())
                .setScoredPenalties(statisticsModel.getScoredPenalties())
                .setMissedPenalties(statisticsModel.getMissedPenalties())
                .setYellowCards(statisticsModel.getYellowCards())
                .setRedCards(statisticsModel.getRedCards())
                .setAverageYellowCardsPerGame(statisticsModel.getAverageYellowCardsPerGame())
                .setAverageRedCardsPerGame(statisticsModel.getAverageRedCardsPerGame())
                .setTeamDTO(team);
    }
}

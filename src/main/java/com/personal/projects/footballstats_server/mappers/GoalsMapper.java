package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.GoalsDTO;
import com.personal.projects.footballstats_server.models.GoalsModel;

public class GoalsMapper extends AbstractMapper<GoalsDTO, GoalsModel>{
    @Override
    public GoalsModel toEntity(GoalsDTO goalsDTO) {
        return new GoalsModel()
                .setTotalGoalsScored(goalsDTO.getTotalGoalsScored())
                .setHomeGoalsScored(goalsDTO.getHomeGoalsScored())
                .setAwayGoalsScored(goalsDTO.getAwayGoalsScored())
                .setAverageTotalGoalsScored(goalsDTO.getAverageTotalGoalsScored())
                .setAverageHomeGoalsScored(goalsDTO.getAverageHomeGoalsScored())
                .setAverageAwayGoalsScored(goalsDTO.getAverageAwayGoalsScored())
                .setTotalGoalsConceded(goalsDTO.getTotalGoalsConceded())
                .setHomeGoalsConceded(goalsDTO.getHomeGoalsConceded())
                .setAwayGoalsConceded(goalsDTO.getAwayGoalsConceded())
                .setAverageTotalGoalsConceded(goalsDTO.getAverageTotalGoalsConceded())
                .setAverageHomeGoalsConceded(goalsDTO.getAverageHomeGoalsConceded())
                .setAverageAwayGoalsConceded(goalsDTO.getAverageAwayGoalsConceded());
    }

    @Override
    public GoalsDTO toDTO(GoalsModel goalsModel) {
        return new GoalsDTO()
                .setTotalGoalsScored(goalsModel.getTotalGoalsScored())
                .setHomeGoalsScored(goalsModel.getHomeGoalsScored())
                .setAwayGoalsScored(goalsModel.getAwayGoalsScored())
                .setAverageTotalGoalsScored(goalsModel.getAverageTotalGoalsScored())
                .setAverageHomeGoalsScored(goalsModel.getAverageHomeGoalsScored())
                .setAverageAwayGoalsScored(goalsModel.getAverageAwayGoalsScored())
                .setTotalGoalsConceded(goalsModel.getTotalGoalsConceded())
                .setHomeGoalsConceded(goalsModel.getHomeGoalsConceded())
                .setAwayGoalsConceded(goalsModel.getAwayGoalsConceded())
                .setAverageTotalGoalsConceded(goalsModel.getAverageTotalGoalsConceded())
                .setAverageHomeGoalsConceded(goalsModel.getAverageHomeGoalsConceded())
                .setAverageAwayGoalsConceded(goalsModel.getAverageAwayGoalsConceded());
    }
}

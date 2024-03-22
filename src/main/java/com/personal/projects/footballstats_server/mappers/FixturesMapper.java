package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.FixturesDTO;
import com.personal.projects.footballstats_server.models.FixturesModel;

public class FixturesMapper extends AbstractMapper<FixturesDTO, FixturesModel>{


    @Override
    public FixturesModel toEntity(FixturesDTO fixturesDTO) {
        return new FixturesModel()
                .setTotalGamesPlayed(fixturesDTO.getTotalGamesPlayed())
                .setHomeGamesPlayed(fixturesDTO.getHomeGamesPlayed())
                .setAwayGamesPlayed(fixturesDTO.getAwayGamesPlayed())
                .setTotalWins(fixturesDTO.getTotalWins())
                .setHomeWins(fixturesDTO.getHomeWins())
                .setAwayWins(fixturesDTO.getAwayWins())
                .setTotalDraws(fixturesDTO.getTotalDraws())
                .setHomeDraws(fixturesDTO.getHomeDraws())
                .setAwayDraws(fixturesDTO.getAwayDraws())
                .setTotalLoses(fixturesDTO.getTotalLoses())
                .setHomeLoses(fixturesDTO.getHomeLoses())
                .setAwayLoses(fixturesDTO.getAwayLoses());
    }

    @Override
    public FixturesDTO toDTO(FixturesModel fixturesModel) {
        return new FixturesDTO()
                .setTotalGamesPlayed(fixturesModel.getTotalGamesPlayed())
                .setHomeGamesPlayed(fixturesModel.getHomeGamesPlayed())
                .setAwayGamesPlayed(fixturesModel.getAwayGamesPlayed())
                .setTotalWins(fixturesModel.getTotalWins())
                .setHomeWins(fixturesModel.getHomeWins())
                .setAwayWins(fixturesModel.getAwayWins())
                .setTotalDraws(fixturesModel.getTotalDraws())
                .setHomeDraws(fixturesModel.getHomeDraws())
                .setAwayDraws(fixturesModel.getAwayDraws())
                .setTotalLoses(fixturesModel.getTotalLoses())
                .setHomeLoses(fixturesModel.getHomeLoses())
                .setAwayLoses(fixturesModel.getAwayLoses());
    }
}

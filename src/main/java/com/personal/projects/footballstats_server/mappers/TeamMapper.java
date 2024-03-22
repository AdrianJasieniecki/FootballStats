package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.*;
import com.personal.projects.footballstats_server.models.*;

public class TeamMapper extends AbstractMapper<TeamDTO, TeamModel>{
    @Override
    public TeamModel toEntity(TeamDTO teamDTO) {
        CountryModel countryModel = new CountryMapper().toEntity(teamDTO.getCountryDTO());
        VenueModel venueModel = new VenueMapper().toEntity(teamDTO.getVenueDTO());
        LeagueModel leagueModel = new LeagueMapper().toEntity(teamDTO.getLeagueDTO());
        StatisticsModel statisticsModel = new StatisticsMapper().toEntity(teamDTO.getStatisticsDTO());
        return new TeamModel()
                .setName(teamDTO.getName())
                .setCode(teamDTO.getCode())
                .setFoundationYear(teamDTO.getFoundationYear())
                .setNational(teamDTO.getNational())
                .setLogoURL(teamDTO.getLogoURL())
                .setApiId(teamDTO.getApiId())
                .setPointsInLeague(teamDTO.getPointsInLeague())
                .setStandingsInLeague(teamDTO.getStandingsInLeague())
                .setCountry(countryModel)
                .setVenue(venueModel)
                .setLeague(leagueModel)
                .setStatistics(statisticsModel);
    }

    @Override
    public TeamDTO toDTO(TeamModel teamModel) {
        CountryDTO countryDTO = new CountryMapper().toDTO(teamModel.getCountry());
        VenueDTO venueDTO = new VenueMapper().toDTO(teamModel.getVenue());
        LeagueDTO leagueDTO = new LeagueMapper().toDTO(teamModel.getLeague());
        StatisticsDTO statisticsDTO = new StatisticsMapper().toDTO(teamModel.getStatistics());
        return new TeamDTO()
                .setId(teamModel.getId())
                .setName(teamModel.getName())
                .setCode(teamModel.getCode())
                .setFoundationYear(teamModel.getFoundationYear())
                .setNational(teamModel.getNational())
                .setLogoURL(teamModel.getLogoURL())
                .setApiId(teamModel.getApiId())
                .setPointsInLeague(teamModel.getPointsInLeague())
                .setStandingsInLeague(teamModel.getStandingsInLeague())
                .setCountryDTO(countryDTO)
                .setVenueDTO(venueDTO)
                .setLeagueDTO(leagueDTO)
                .setStatisticsDTO(statisticsDTO);
    }
}

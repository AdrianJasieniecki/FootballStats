package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.CountryDTO;
import com.personal.projects.footballstats_server.dtos.LeagueDTO;
import com.personal.projects.footballstats_server.dtos.TeamDTO;
import com.personal.projects.footballstats_server.models.CountryModel;
import com.personal.projects.footballstats_server.models.LeagueModel;
import com.personal.projects.footballstats_server.models.TeamModel;

import java.util.Set;

public class LeagueMapper extends AbstractMapper<LeagueDTO, LeagueModel>{
    @Override
    public LeagueModel toEntity(LeagueDTO leagueDTO) {
        Set<TeamModel> teams = new TeamMapper().toEntity(leagueDTO.getTeams());
        CountryModel countryModel = new CountryMapper().toEntity(leagueDTO.getCountryDTO());
        return new LeagueModel()
                .setName(leagueDTO.getName())
                .setType(leagueDTO.getType())
                .setLogoURL(leagueDTO.getLogoURL())
                .setTeams(teams)
                .setCountry(countryModel);
    }

    @Override
    public LeagueDTO toDTO(LeagueModel leagueModel) {
        Set<TeamDTO> teams = new TeamMapper().toDTO(leagueModel.getTeams());
        CountryDTO countryDTO = new CountryMapper().toDTO(leagueModel.getCountry());
        return new LeagueDTO()
                .setId(leagueModel.getId())
                .setName(leagueModel.getName())
                .setType(leagueModel.getType())
                .setLogoURL(leagueModel.getLogoURL())
                .setTeams(teams)
                .setCountryDTO(countryDTO);
    }
}

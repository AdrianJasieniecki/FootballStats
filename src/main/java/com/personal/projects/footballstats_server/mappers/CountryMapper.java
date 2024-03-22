package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.CountryDTO;
import com.personal.projects.footballstats_server.dtos.LeagueDTO;
import com.personal.projects.footballstats_server.dtos.TeamDTO;
import com.personal.projects.footballstats_server.models.CountryModel;
import com.personal.projects.footballstats_server.models.LeagueModel;
import com.personal.projects.footballstats_server.models.TeamModel;

import java.util.Set;

public class CountryMapper extends AbstractMapper<CountryDTO, CountryModel>{

    @Override
    public CountryModel toEntity(CountryDTO countryDTO) {
        Set<TeamModel> teams = new TeamMapper().toEntity(countryDTO.getTeams());
        Set<LeagueModel> leagues = new LeagueMapper().toEntity(countryDTO.getLeagues());
        return new CountryModel()
                .setName(countryDTO.getName())
                .setCode(countryDTO.getCode())
                .setFlagURL(countryDTO.getFlagURL())
                .setTeams(teams)
                .setLeagues(leagues);
    }

    @Override
    public CountryDTO toDTO(CountryModel countryModel) {
        Set<TeamDTO> teams = new TeamMapper().toDTO(countryModel.getTeams());
        Set<LeagueDTO> leagues = new LeagueMapper().toDTO(countryModel.getLeagues());
        return new CountryDTO()
                .setId(countryModel.getId())
                .setName(countryModel.getName())
                .setCode(countryModel.getCode())
                .setFlagURL(countryModel.getFlagURL())
                .setTeams(teams)
                .setLeagues(leagues);
    }
}

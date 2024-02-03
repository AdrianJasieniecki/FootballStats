package com.personal.projects.footballstats_server.dtos;

import com.personal.projects.footballstats_server.models.LeagueModel;
import com.personal.projects.footballstats_server.models.TeamModel;

import java.util.Set;

public class CountryDTO {

    private Long id;
    private String name;
    private String code;
    private String flagURL;
    private Set<TeamDTO> teams;
    private Set<LeagueDTO> leagues;

    public Long getId() {
        return id;
    }

    public CountryDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CountryDTO setCode(String code) {
        this.code = code;
        return this;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public CountryDTO setFlagURL(String flagURL) {
        this.flagURL = flagURL;
        return this;
    }

    public Set<TeamDTO> getTeams() {
        return teams;
    }

    public CountryDTO setTeams(Set<TeamDTO> teams) {
        this.teams = teams;
        return this;
    }

    public Set<LeagueDTO> getLeagues() {
        return leagues;
    }

    public CountryDTO setLeagues(Set<LeagueDTO> leagues) {
        this.leagues = leagues;
        return this;
    }
}

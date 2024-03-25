package com.personal.projects.footballstats_server.dtos;

import java.util.Set;

public class LeagueDTO extends AbstractDTO{

    private Long id;
    private String name;
    private String type;
    private String logoURL;
    private Set<TeamDTO> teams;
    private CountryDTO countryDTO;

    public Long getId() {
        return id;
    }

    public LeagueDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public LeagueDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public LeagueDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public LeagueDTO setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    public Set<TeamDTO> getTeams() {
        return teams;
    }

    public LeagueDTO setTeams(Set<TeamDTO> teams) {
        this.teams = teams;
        return this;
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public LeagueDTO setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
        return this;
    }
}

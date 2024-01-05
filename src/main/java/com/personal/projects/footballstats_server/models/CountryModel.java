package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CountryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_generator")
    @SequenceGenerator(name = "country_generator", sequenceName = "country_seq", allocationSize = 1)
    @Column(name = "country_id", nullable = false)
    private Long id;

    @Column(name = "Country_name")
    private String name;

    @Column(name = "Country_code")
    private String code;

    @Column(name = "Flag_URL")
    private String flagURL;

    @OneToMany(mappedBy = "country")
    private Set<TeamModel> teams;

    @OneToMany(mappedBy = "country")
    private Set<LeagueModel> leagues;

    public Long getId() {
        return id;
    }

    public CountryModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CountryModel setCode(String code) {
        this.code = code;
        return this;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public CountryModel setFlagURL(String flagURL) {
        this.flagURL = flagURL;
        return this;
    }

    public Set<TeamModel> getTeams() {
        return teams;
    }

    public CountryModel setTeams(Set<TeamModel> teams) {
        this.teams = teams;
        return this;
    }

    public Set<LeagueModel> getLeagues() {
        return leagues;
    }

    public CountryModel setLeagues(Set<LeagueModel> leagues) {
        this.leagues = leagues;
        return this;
    }
}

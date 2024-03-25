package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "COUNTRY")
public class CountryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_generator")
    @SequenceGenerator(name = "country_generator", sequenceName = "country_seq", allocationSize = 1)
    @Column(name = "country_id", nullable = false)
    private Long id;

    @Column(name = "country_name")
    private String name;

    @Column(name = "country_code")
    private String code;

    @Column(name = "flag_url")
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

    @Override
    public String toString() {
        return "CountryModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", flagURL='" + flagURL + '\'' +
                ", teams=" + teams +
                ", leagues=" + leagues +
                '}';
    }
}

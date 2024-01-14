package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "LEAGUE")
public class LeagueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "league_generator")
    @SequenceGenerator(name = "league_generator", sequenceName = "league_seq", allocationSize = 1)
    @Column(name = "League_id", nullable = false)
    private Long id;

    @Column(name = "League_name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Logo_URL")
    private String logoURL;

    @OneToMany(mappedBy = "league")
    private Set<TeamModel> teams;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Country_id", nullable = false)
    private CountryModel country;

    public Long getId() {
        return id;
    }

    public LeagueModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public LeagueModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public LeagueModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public LeagueModel setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    public Set<TeamModel> getTeams() {
        return teams;
    }

    public LeagueModel setTeams(Set<TeamModel> teams) {
        this.teams = teams;
        return this;
    }

    public CountryModel getCountry() {
        return country;
    }

    public LeagueModel setCountry(CountryModel country) {
        this.country = country;
        return this;
    }
}

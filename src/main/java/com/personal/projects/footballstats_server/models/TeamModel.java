package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_generator")
    @SequenceGenerator(name = "team_generator", sequenceName = "team_seq", allocationSize = 1)
    @Column(name = "Team_id", nullable = false)
    private Long id;

    @Column(name = "Club_name")
    private String name;

    @Column(name = "Club_code")
    private String code;

    @Column(name = "Club_foundation_year")
    private Long foundationYear;

    @Column(name = "Club_national")
    private Boolean national;

    @Column(name = "Club_logo_URL")
    private String logoURL;

    @Column(name = "Club_api_id")
    private Long apiId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Country_id", nullable = false)
    private CountryModel country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Venue_id", nullable = false)
    private VenueModel venue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "League_id", nullable = false)
    private LeagueModel league;

    public Long getId() {
        return id;
    }

    public TeamModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TeamModel setName(String name) {
        this.name = name;
        return this;
    }

    public CountryModel getCountry() {
        return country;
    }

    public TeamModel setCountry(CountryModel country) {
        this.country = country;
        return this;
    }

    public String getCode() {
        return code;
    }

    public TeamModel setCode(String code) {
        this.code = code;
        return this;
    }

    public Long getFoundationYear() {
        return foundationYear;
    }

    public TeamModel setFoundationYear(Long foundationYear) {
        this.foundationYear = foundationYear;
        return this;
    }

    public Boolean getNational() {
        return national;
    }

    public TeamModel setNational(Boolean national) {
        this.national = national;
        return this;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public TeamModel setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    public Long getApiId() {
        return apiId;
    }

    public TeamModel setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }

    public VenueModel getVenue() {
        return venue;
    }

    public TeamModel setVenue(VenueModel venue) {
        this.venue = venue;
        return this;
    }

    public LeagueModel getLeague() {
        return league;
    }

    public TeamModel setLeague(LeagueModel league) {
        this.league = league;
        return this;
    }
}

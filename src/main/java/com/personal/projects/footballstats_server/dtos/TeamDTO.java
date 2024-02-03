package com.personal.projects.footballstats_server.dtos;

import com.personal.projects.footballstats_server.models.VenueModel;

public class TeamDTO {

    private Long id;
    private String name;
    private String code;
    private Long foundationYear;
    private Boolean national;
    private String logoURL;
    private Long apiId;
    private Integer pointsInLeague;
    private Integer standingsInLeague;
    private CountryDTO countryDTO;
    private VenueDTO venueDTO;
    private LeagueDTO leagueDTO;
    private StatisticsDTO statisticsDTO;

    public Long getId() {
        return id;
    }

    public TeamDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TeamDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public TeamDTO setCode(String code) {
        this.code = code;
        return this;
    }

    public Long getFoundationYear() {
        return foundationYear;
    }

    public TeamDTO setFoundationYear(Long foundationYear) {
        this.foundationYear = foundationYear;
        return this;
    }

    public Boolean getNational() {
        return national;
    }

    public TeamDTO setNational(Boolean national) {
        this.national = national;
        return this;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public TeamDTO setLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    public Long getApiId() {
        return apiId;
    }

    public TeamDTO setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }

    public Integer getPointsInLeague() {
        return pointsInLeague;
    }

    public TeamDTO setPointsInLeague(Integer pointsInLeague) {
        this.pointsInLeague = pointsInLeague;
        return this;
    }

    public Integer getStandingsInLeague() {
        return standingsInLeague;
    }

    public TeamDTO setStandingsInLeague(Integer standingsInLeague) {
        this.standingsInLeague = standingsInLeague;
        return this;
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public TeamDTO setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
        return this;
    }

    public VenueDTO getVenueDTO() {
        return venueDTO;
    }

    public TeamDTO setVenueDTO(VenueDTO venueDTO) {
        this.venueDTO = venueDTO;
        return this;
    }

    public LeagueDTO getLeagueDTO() {
        return leagueDTO;
    }

    public TeamDTO setLeagueDTO(LeagueDTO leagueDTO) {
        this.leagueDTO = leagueDTO;
        return this;
    }

    public StatisticsDTO getStatisticsDTO() {
        return statisticsDTO;
    }

    public TeamDTO setStatisticsDTO(StatisticsDTO statisticsDTO) {
        this.statisticsDTO = statisticsDTO;
        return this;
    }
}

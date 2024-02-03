package com.personal.projects.footballstats_server.dtos;

public class FixturesDTO {

    private Long totalGamesPlayed;
    private Long homeGamesPlayed;
    private Long awayGamesPlayed;

    private Long totalWins;
    private Long homeWins;
    private Long awayWins;

    private Long totalDraws;
    private Long homeDraws;
    private Long awayDraws;

    private Long totalLoses;
    private Long homeLoses;
    private Long awayLoses;

    public Long getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public FixturesDTO setTotalGamesPlayed(Long totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
        return this;
    }

    public Long getHomeGamesPlayed() {
        return homeGamesPlayed;
    }

    public FixturesDTO setHomeGamesPlayed(Long homeGamesPlayed) {
        this.homeGamesPlayed = homeGamesPlayed;
        return this;
    }

    public Long getAwayGamesPlayed() {
        return awayGamesPlayed;
    }

    public FixturesDTO setAwayGamesPlayed(Long awayGamesPlayed) {
        this.awayGamesPlayed = awayGamesPlayed;
        return this;
    }

    public Long getTotalWins() {
        return totalWins;
    }

    public FixturesDTO setTotalWins(Long totalWins) {
        this.totalWins = totalWins;
        return this;
    }

    public Long getHomeWins() {
        return homeWins;
    }

    public FixturesDTO setHomeWins(Long homeWins) {
        this.homeWins = homeWins;
        return this;
    }

    public Long getAwayWins() {
        return awayWins;
    }

    public FixturesDTO setAwayWins(Long awayWins) {
        this.awayWins = awayWins;
        return this;
    }

    public Long getTotalDraws() {
        return totalDraws;
    }

    public FixturesDTO setTotalDraws(Long totalDraws) {
        this.totalDraws = totalDraws;
        return this;
    }

    public Long getHomeDraws() {
        return homeDraws;
    }

    public FixturesDTO setHomeDraws(Long homeDraws) {
        this.homeDraws = homeDraws;
        return this;
    }

    public Long getAwayDraws() {
        return awayDraws;
    }

    public FixturesDTO setAwayDraws(Long awayDraws) {
        this.awayDraws = awayDraws;
        return this;
    }

    public Long getTotalLoses() {
        return totalLoses;
    }

    public FixturesDTO setTotalLoses(Long totalLoses) {
        this.totalLoses = totalLoses;
        return this;
    }

    public Long getHomeLoses() {
        return homeLoses;
    }

    public FixturesDTO setHomeLoses(Long homeLoses) {
        this.homeLoses = homeLoses;
        return this;
    }

    public Long getAwayLoses() {
        return awayLoses;
    }

    public FixturesDTO setAwayLoses(Long awayLoses) {
        this.awayLoses = awayLoses;
        return this;
    }
}

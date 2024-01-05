package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

@Embeddable
public class FixturesModel {

    @Column(name = "Total_games_played")
    private Long totalGamesPlayed;
    @Column(name = "Home_games_played")
    private Long homeGamesPlayed;
    @Column(name = "Away_games_played")
    private Long awayGamesPlayed;

    @Column(name = "Total_wins")
    private Long totalWins;
    @Column(name = "Home_wins")
    private Long homeWins;
    @Column(name = "Away_wins")
    private Long awayWins;

    @Column(name = "Total_draws")
    private Long totalDraws;
    @Column(name = "Home_draws")
    private Long homeDraws;
    @Column(name = "Away_draws")
    private Long awayDraws;

    @Column(name = "Total_loses")
    private Long totalLoses;
    @Column(name = "Home_loses")
    private Long homeLoses;
    @Column(name = "Away_loses")
    private Long awayLoses;

    public Long getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public FixturesModel setTotalGamesPlayed(Long totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
        return this;
    }

    public Long getHomeGamesPlayed() {
        return homeGamesPlayed;
    }

    public FixturesModel setHomeGamesPlayed(Long homeGamesPlayed) {
        this.homeGamesPlayed = homeGamesPlayed;
        return this;
    }

    public Long getAwayGamesPlayed() {
        return awayGamesPlayed;
    }

    public FixturesModel setAwayGamesPlayed(Long awayGamesPlayed) {
        this.awayGamesPlayed = awayGamesPlayed;
        return this;
    }

    public Long getTotalWins() {
        return totalWins;
    }

    public FixturesModel setTotalWins(Long totalWins) {
        this.totalWins = totalWins;
        return this;
    }

    public Long getHomeWins() {
        return homeWins;
    }

    public FixturesModel setHomeWins(Long homeWins) {
        this.homeWins = homeWins;
        return this;
    }

    public Long getAwayWins() {
        return awayWins;
    }

    public FixturesModel setAwayWins(Long awayWins) {
        this.awayWins = awayWins;
        return this;
    }

    public Long getTotalDraws() {
        return totalDraws;
    }

    public FixturesModel setTotalDraws(Long totalDraws) {
        this.totalDraws = totalDraws;
        return this;
    }

    public Long getHomeDraws() {
        return homeDraws;
    }

    public FixturesModel setHomeDraws(Long homeDraws) {
        this.homeDraws = homeDraws;
        return this;
    }

    public Long getAwayDraws() {
        return awayDraws;
    }

    public FixturesModel setAwayDraws(Long awayDraws) {
        this.awayDraws = awayDraws;
        return this;
    }

    public Long getTotalLoses() {
        return totalLoses;
    }

    public FixturesModel setTotalLoses(Long totalLoses) {
        this.totalLoses = totalLoses;
        return this;
    }

    public Long getHomeLoses() {
        return homeLoses;
    }

    public FixturesModel setHomeLoses(Long homeLoses) {
        this.homeLoses = homeLoses;
        return this;
    }

    public Long getAwayLoses() {
        return awayLoses;
    }

    public FixturesModel setAwayLoses(Long awayLoses) {
        this.awayLoses = awayLoses;
        return this;
    }
}

package com.personal.projects.footballstats_server.dtos;

public class StatisticsDTO {

    private Long id;
    private String form;
    private GoalsDTO goalsDTO;
    private FixturesDTO fixturesDTO;
    private Integer totalCleanSheets;
    private Integer homeCleanSheets;
    private Integer awayCleanSheets;
    private Integer totalPenalties;
    private Integer scoredPenalties;
    private Integer missedPenalties;
    private Integer yellowCards;
    private Integer redCards;
    private Double averageYellowCardsPerGame;
    private Double averageRedCardsPerGame;
    private TeamDTO teamDTO;

    public Long getId() {
        return id;
    }

    public StatisticsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getForm() {
        return form;
    }

    public StatisticsDTO setForm(String form) {
        this.form = form;
        return this;
    }

    public GoalsDTO getGoalsDTO() {
        return goalsDTO;
    }

    public StatisticsDTO setGoalsDTO(GoalsDTO goalsDTO) {
        this.goalsDTO = goalsDTO;
        return this;
    }

    public FixturesDTO getFixturesDTO() {
        return fixturesDTO;
    }

    public StatisticsDTO setFixturesDTO(FixturesDTO fixturesDTO) {
        this.fixturesDTO = fixturesDTO;
        return this;
    }

    public Integer getTotalCleanSheets() {
        return totalCleanSheets;
    }

    public StatisticsDTO setTotalCleanSheets(Integer totalCleanSheets) {
        this.totalCleanSheets = totalCleanSheets;
        return this;
    }

    public Integer getHomeCleanSheets() {
        return homeCleanSheets;
    }

    public StatisticsDTO setHomeCleanSheets(Integer homeCleanSheets) {
        this.homeCleanSheets = homeCleanSheets;
        return this;
    }

    public Integer getAwayCleanSheets() {
        return awayCleanSheets;
    }

    public StatisticsDTO setAwayCleanSheets(Integer awayCleanSheets) {
        this.awayCleanSheets = awayCleanSheets;
        return this;
    }

    public Integer getTotalPenalties() {
        return totalPenalties;
    }

    public StatisticsDTO setTotalPenalties(Integer totalPenalties) {
        this.totalPenalties = totalPenalties;
        return this;
    }

    public Integer getScoredPenalties() {
        return scoredPenalties;
    }

    public StatisticsDTO setScoredPenalties(Integer scoredPenalties) {
        this.scoredPenalties = scoredPenalties;
        return this;
    }

    public Integer getMissedPenalties() {
        return missedPenalties;
    }

    public StatisticsDTO setMissedPenalties(Integer missedPenalties) {
        this.missedPenalties = missedPenalties;
        return this;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public StatisticsDTO setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
        return this;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public StatisticsDTO setRedCards(Integer redCards) {
        this.redCards = redCards;
        return this;
    }

    public Double getAverageYellowCardsPerGame() {
        return averageYellowCardsPerGame;
    }

    public StatisticsDTO setAverageYellowCardsPerGame(Double averageYellowCardsPerGame) {
        this.averageYellowCardsPerGame = averageYellowCardsPerGame;
        return this;
    }

    public Double getAverageRedCardsPerGame() {
        return averageRedCardsPerGame;
    }

    public StatisticsDTO setAverageRedCardsPerGame(Double averageRedCardsPerGame) {
        this.averageRedCardsPerGame = averageRedCardsPerGame;
        return this;
    }

    public TeamDTO getTeamDTO() {
        return teamDTO;
    }

    public StatisticsDTO setTeamDTO(TeamDTO teamDTO) {
        this.teamDTO = teamDTO;
        return this;
    }
}

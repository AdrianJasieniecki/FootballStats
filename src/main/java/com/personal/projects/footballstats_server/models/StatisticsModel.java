package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

@Entity
@Table(name = "STATS")
public class StatisticsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stats_generator")
    @SequenceGenerator(name = "stats_generator", sequenceName = "stats_seq", allocationSize = 1)
    @Column(name = "Stats_id", nullable = false)
    private Long id;

    @Column(name = "Team_form")
    private String form;

    @Embedded
    private FixturesModel fixtures;

    @Embedded
    private GoalsModel goals;

    @Column(name = "Total_clean_sheets")
    private Integer totalCleanSheets;
    @Column(name = "Home_clean_sheets")
    private Integer homeCleanSheets;
    @Column(name = "Away_clean_sheets")
    private Integer awayCleanSheets;

    @Column(name = "Total_penalties")
    private Integer totalPenalties;
    @Column(name = "Scored_penalties")
    private Integer scoredPenalties;
    @Column(name = "Missed_penalties")
    private Integer missedPenalties;

    @Column(name = "Yellow_cards")
    private Integer yellowCards;
    @Column(name = "Red_cards")
    private Integer redCards;
    @Column(name = "Average_yellow_cards_per_game")
    private Double averageYellowCardsPerGame;
    @Column(name = "Average_red_cards_per_game")
    private Double averageRedCardsPerGame;

    @OneToOne(mappedBy = "statistics")
    private TeamModel team;

    public Long getId() {
        return id;
    }

    public StatisticsModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getForm() {
        return form;
    }

    public StatisticsModel setForm(String form) {
        this.form = form;
        return this;
    }

    public FixturesModel getFixtures() {
        return fixtures;
    }

    public StatisticsModel setFixtures(FixturesModel fixtures) {
        this.fixtures = fixtures;
        return this;
    }

    public GoalsModel getGoals() {
        return goals;
    }

    public StatisticsModel setGoals(GoalsModel goalsScored) {
        this.goals = goalsScored;
        return this;
    }

    public Integer getTotalCleanSheets() {
        return totalCleanSheets;
    }

    public StatisticsModel setTotalCleanSheets(Integer totalCleanSheets) {
        this.totalCleanSheets = totalCleanSheets;
        return this;
    }

    public Integer getHomeCleanSheets() {
        return homeCleanSheets;
    }

    public StatisticsModel setHomeCleanSheets(Integer homeCleanSheets) {
        this.homeCleanSheets = homeCleanSheets;
        return this;
    }

    public Integer getAwayCleanSheets() {
        return awayCleanSheets;
    }

    public StatisticsModel setAwayCleanSheets(Integer awayCleanSheets) {
        this.awayCleanSheets = awayCleanSheets;
        return this;
    }

    public Integer getTotalPenalties() {
        return totalPenalties;
    }

    public StatisticsModel setTotalPenalties(Integer totalPenalties) {
        this.totalPenalties = totalPenalties;
        return this;
    }

    public Integer getScoredPenalties() {
        return scoredPenalties;
    }

    public StatisticsModel setScoredPenalties(Integer scoredPenalties) {
        this.scoredPenalties = scoredPenalties;
        return this;
    }

    public Integer getMissedPenalties() {
        return missedPenalties;
    }

    public StatisticsModel setMissedPenalties(Integer missedPenalties) {
        this.missedPenalties = missedPenalties;
        return this;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public StatisticsModel setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
        return this;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public StatisticsModel setRedCards(Integer redCards) {
        this.redCards = redCards;
        return this;
    }

    public TeamModel getTeam() {
        return team;
    }

    public StatisticsModel setTeam(TeamModel team) {
        this.team = team;
        return this;
    }

    public Double getAverageYellowCardsPerGame() {
        return averageYellowCardsPerGame;
    }

    public StatisticsModel setAverageYellowCardsPerGame(Double averageYellowCardsPerGame) {
        this.averageYellowCardsPerGame = averageYellowCardsPerGame;
        return this;
    }

    public Double getAverageRedCardsPerGame() {
        return averageRedCardsPerGame;
    }

    public StatisticsModel setAverageRedCardsPerGame(Double averageRedCardsPerGame) {
        this.averageRedCardsPerGame = averageRedCardsPerGame;
        return this;
    }
}

package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

@Entity
public class StatisticsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stats_generator")
    @SequenceGenerator(name = "stats_generator", sequenceName = "stats_seq", allocationSize = 1)
    @Column(name = "Stats_id", nullable = false)
    private Long id;

    @Column(name = "Team_form")
    private String form;

    @Embedded
    @Column(name = "Fixtures")
    private FixturesModel fixtures;

    @Embedded
    @Column(name = "Goals_scored")
    private GoalsModel goalsScored;
    @Embedded
    @Column(name = "Goals_conceded")
    private GoalsModel goalsConceded;

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

    public GoalsModel getGoalsScored() {
        return goalsScored;
    }

    public StatisticsModel setGoalsScored(GoalsModel goalsScored) {
        this.goalsScored = goalsScored;
        return this;
    }

    public GoalsModel getGoalsConceded() {
        return goalsConceded;
    }

    public StatisticsModel setGoalsConceded(GoalsModel goalsConceded) {
        this.goalsConceded = goalsConceded;
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
}

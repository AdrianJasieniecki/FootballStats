package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

@Embeddable
public class GoalsModel {

    @Column(name = "Total_goals_scored")
    private Integer totalGoalsScored;
    @Column(name = "Home_goals_scored")
    private Integer homeGoalsScored;
    @Column(name = "Away_goals_scored")
    private Integer awayGoalsScored;

    @Column(name = "Average_total_goals_scored")
    private Double averageTotalGoalsScored;
    @Column(name = "Average_home_goals_scored")
    private Double averageHomeGoalsScored;
    @Column(name = "Average_away_goals_scored")
    private Double averageAwayGoalsScored;

    @Column(name = "Total_goals_conceded")
    private Integer totalGoalsConceded;
    @Column(name = "Home_goals_conceded")
    private Integer homeGoalsConceded;
    @Column(name = "Away_goals_conceded")
    private Integer awayGoalsConceded;

    @Column(name = "Average_total_goals_conceded")
    private Double averageTotalGoalsConceded;
    @Column(name = "Average_home_goals_conceded")
    private Double averageHomeGoalsConceded;
    @Column(name = "Average_away_goals_conceded")
    private Double averageAwayGoalsConceded;

    public Integer getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public GoalsModel setTotalGoalsScored(Integer totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
        return this;
    }

    public Integer getHomeGoalsScored() {
        return homeGoalsScored;
    }

    public GoalsModel setHomeGoalsScored(Integer homeGoalsScored) {
        this.homeGoalsScored = homeGoalsScored;
        return this;
    }

    public Integer getAwayGoalsScored() {
        return awayGoalsScored;
    }

    public GoalsModel setAwayGoalsScored(Integer awayGoalsScored) {
        this.awayGoalsScored = awayGoalsScored;
        return this;
    }

    public Double getAverageTotalGoalsScored() {
        return averageTotalGoalsScored;
    }

    public GoalsModel setAverageTotalGoalsScored(Double averageTotalGoalsScored) {
        this.averageTotalGoalsScored = averageTotalGoalsScored;
        return this;
    }

    public Double getAverageHomeGoalsScored() {
        return averageHomeGoalsScored;
    }

    public GoalsModel setAverageHomeGoalsScored(Double averageHomeGoalsScored) {
        this.averageHomeGoalsScored = averageHomeGoalsScored;
        return this;
    }

    public Double getAverageAwayGoalsScored() {
        return averageAwayGoalsScored;
    }

    public GoalsModel setAverageAwayGoalsScored(Double averageAwayGoalsScored) {
        this.averageAwayGoalsScored = averageAwayGoalsScored;
        return this;
    }

    public Integer getTotalGoalsConceded() {
        return totalGoalsConceded;
    }

    public GoalsModel setTotalGoalsConceded(Integer totalGoalsConceded) {
        this.totalGoalsConceded = totalGoalsConceded;
        return this;
    }

    public Integer getHomeGoalsConceded() {
        return homeGoalsConceded;
    }

    public GoalsModel setHomeGoalsConceded(Integer homeGoalsConceded) {
        this.homeGoalsConceded = homeGoalsConceded;
        return this;
    }

    public Integer getAwayGoalsConceded() {
        return awayGoalsConceded;
    }

    public GoalsModel setAwayGoalsConceded(Integer awayGoalsConceded) {
        this.awayGoalsConceded = awayGoalsConceded;
        return this;
    }

    public Double getAverageTotalGoalsConceded() {
        return averageTotalGoalsConceded;
    }

    public GoalsModel setAverageTotalGoalsConceded(Double averageTotalGoalsConceded) {
        this.averageTotalGoalsConceded = averageTotalGoalsConceded;
        return this;
    }

    public Double getAverageHomeGoalsConceded() {
        return averageHomeGoalsConceded;
    }

    public GoalsModel setAverageHomeGoalsConceded(Double averageHomeGoalsConceded) {
        this.averageHomeGoalsConceded = averageHomeGoalsConceded;
        return this;
    }

    public Double getAverageAwayGoalsConceded() {
        return averageAwayGoalsConceded;
    }

    public GoalsModel setAverageAwayGoalsConceded(Double averageAwayGoalsConceded) {
        this.averageAwayGoalsConceded = averageAwayGoalsConceded;
        return this;
    }
}

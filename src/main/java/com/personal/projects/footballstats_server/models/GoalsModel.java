package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

import java.util.List;

@Embeddable
public class GoalsModel {

    @Column(name = "Total_goals")
    private Integer totalGoals;
    @Column(name = "Home_goals")
    private Integer homeGoals;
    @Column(name = "Away_goals")
    private Integer awayGoals;

    @Column(name = "Average_total_goals")
    private Integer averageTotalGoals;
    @Column(name = "Average_home_goals")
    private Integer averageHomeGoals;
    @Column(name = "Average_away_goals")
    private Integer averageAwayGoals;

    public Integer getTotalGoals() {
        return totalGoals;
    }

    public GoalsModel setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
        return this;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public GoalsModel setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
        return this;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public GoalsModel setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
        return this;
    }

    public Integer getAverageTotalGoals() {
        return averageTotalGoals;
    }

    public GoalsModel setAverageTotalGoals(Integer averageTotalGoals) {
        this.averageTotalGoals = averageTotalGoals;
        return this;
    }

    public Integer getAverageHomeGoals() {
        return averageHomeGoals;
    }

    public GoalsModel setAverageHomeGoals(Integer averageHomeGoals) {
        this.averageHomeGoals = averageHomeGoals;
        return this;
    }

    public Integer getAverageAwayGoals() {
        return averageAwayGoals;
    }

    public GoalsModel setAverageAwayGoals(Integer averageAwayGoals) {
        this.averageAwayGoals = averageAwayGoals;
        return this;
    }

}

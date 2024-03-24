package com.personal.projects.footballstats_server.services;

import com.personal.projects.footballstats_server.models.StatisticsModel;
import com.personal.projects.footballstats_server.repositories.StatisticsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsService {

    Logger logger = LoggerFactory.getLogger(StatisticsService.class);

    private final StatisticsRepository statisticsRepository;

    public StatisticsService(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    public List<StatisticsModel> getAllStatistics() {
        logger.debug("Getting all statistics");
        return statisticsRepository.findAll();
    }

    public StatisticsModel getStatisticsById(Long id) {
        if (statisticsRepository.existsById(id)) {
            logger.debug("Getting statistics for id = " + id);
            return statisticsRepository.getReferenceById(id);
        } else return null;
    }

    public StatisticsModel addNewStatistics(StatisticsModel statisticsModel) {
        if (!statisticsRepository.existsById(statisticsModel.getId())) {
            logger.debug("Adding new statistics = " + statisticsModel);
            return statisticsRepository.save(statisticsModel);
        } else return null;
    }

    public StatisticsModel updateStatistics(StatisticsModel statisticsModel) {
        if (statisticsRepository.existsById(statisticsModel.getId())) {
            logger.debug("Updating statistics = " + statisticsModel);
            return statisticsRepository.save(statisticsModel);
        } else return null;
    }

    public boolean deleteStatisticsById(Long id) {
        if (statisticsRepository.existsById(id)) {
            logger.debug("Deleting statistics for id = " + id);
            statisticsRepository.deleteById(id);
            return true;
        } else return false;
    }
}

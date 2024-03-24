package com.personal.projects.footballstats_server.services;

import com.personal.projects.footballstats_server.models.CountryModel;
import com.personal.projects.footballstats_server.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    Logger logger = LoggerFactory.getLogger(CountryService.class);

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        logger.debug("Creating country service");
        this.countryRepository = countryRepository;
    }

    public List<CountryModel> getAllCountries() {
        logger.debug("Getting all countries");
        return countryRepository.findAll();
    }

    public CountryModel getCountryById(Long id) {
        if(countryRepository.existsById(id)) {
            logger.debug("Getting country for id = " + id);
            return countryRepository.getReferenceById(id);
        } else return null;
    }

    public CountryModel addNewCountry(CountryModel countryModel) {
//        if(!countryRepository.existsById(countryModel.getId())) {
//            logger.debug("Adding new country = " + countryModel);
//            return countryRepository.save(countryModel);
//        } else return null;
        return countryRepository.save(countryModel);
    }

    public boolean deleteCountryById(Long id) {
        if (countryRepository.existsById(id)) {
            logger.debug("Deleting country for id = " + id);
            countryRepository.deleteById(id);
            return true;
        } else return false;
    }

    public CountryModel updateCountry(CountryModel countryModel) {
        if (countryRepository.existsById(countryModel.getId())) {
            logger.debug("Updating country = " + countryModel);
            return countryRepository.save(countryModel);
        } else return null;
    }
}

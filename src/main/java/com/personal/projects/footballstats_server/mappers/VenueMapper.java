package com.personal.projects.footballstats_server.mappers;

import com.personal.projects.footballstats_server.dtos.TeamDTO;
import com.personal.projects.footballstats_server.dtos.VenueDTO;
import com.personal.projects.footballstats_server.models.TeamModel;
import com.personal.projects.footballstats_server.models.VenueModel;

import java.util.Set;

public class VenueMapper extends AbstractMapper<VenueDTO, VenueModel>{
    @Override
    public VenueModel toEntity(VenueDTO venueDTO) {
        Set<TeamModel> teams = new TeamMapper().toEntity(venueDTO.getTeams());
        return new VenueModel()
                .setName(venueDTO.getName())
                .setAddress(venueDTO.getAddress())
                .setCity(venueDTO.getCity())
                .setCapacity(venueDTO.getCapacity())
                .setSurface(venueDTO.getSurface())
                .setImageURL(venueDTO.getImageURL())
                .setApiId(venueDTO.getApiId())
                .setTeams(teams);
    }

    @Override
    public VenueDTO toDTO(VenueModel venueModel) {
        Set<TeamDTO> teams = new TeamMapper().toDTO(venueModel.getTeams());
        return new VenueDTO()
                .setId(venueModel.getId())
                .setName(venueModel.getName())
                .setAddress(venueModel.getAddress())
                .setCity(venueModel.getCity())
                .setCapacity(venueModel.getCapacity())
                .setSurface(venueModel.getSurface())
                .setImageURL(venueModel.getImageURL())
                .setApiId(venueModel.getApiId())
                .setTeams(teams);
    }
}

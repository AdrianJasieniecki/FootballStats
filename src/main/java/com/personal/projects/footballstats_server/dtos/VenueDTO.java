package com.personal.projects.footballstats_server.dtos;

import java.util.Set;

public class VenueDTO {

    private Long id;
    private String name;
    private String address;
    private String city;
    private Long capacity;
    private String surface;
    private String imageURL;
    private Long apiId;
    private Set<TeamDTO> teams;

    public Long getId() {
        return id;
    }

    public VenueDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public VenueDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public VenueDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public VenueDTO setCity(String city) {
        this.city = city;
        return this;
    }

    public Long getCapacity() {
        return capacity;
    }

    public VenueDTO setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getSurface() {
        return surface;
    }

    public VenueDTO setSurface(String surface) {
        this.surface = surface;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public VenueDTO setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public Long getApiId() {
        return apiId;
    }

    public VenueDTO setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }

    public Set<TeamDTO> getTeams() {
        return teams;
    }

    public VenueDTO setTeams(Set<TeamDTO> teams) {
        this.teams = teams;
        return this;
    }
}

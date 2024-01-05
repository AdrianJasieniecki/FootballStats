package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class VenueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venue_generator")
    @SequenceGenerator(name = "venue_generator", sequenceName = "venue_seq", allocationSize = 1)
    @Column(name = "Venue_id", nullable = false)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Capacity")
    private Long capacity;
    @Column(name = "Surface")
    private String surface;
    @Column(name = "Image_id")
    private Long imageDataId;
    @Column(name = "Api_id")
    private Long apiId;
    @OneToMany(mappedBy = "venue")
    private Set<TeamModel> teams;

    public Long getId() {
        return id;
    }

    public VenueModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public VenueModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public VenueModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public VenueModel setCity(String city) {
        this.city = city;
        return this;
    }

    public Long getCapacity() {
        return capacity;
    }

    public VenueModel setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getSurface() {
        return surface;
    }

    public VenueModel setSurface(String surface) {
        this.surface = surface;
        return this;
    }

    public Long getImageDataId() {
        return imageDataId;
    }

    public VenueModel setImageDataId(Long imageDataId) {
        this.imageDataId = imageDataId;
        return this;
    }

    public Long getApiId() {
        return apiId;
    }

    public VenueModel setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }

    public Set<TeamModel> getTeams() {
        return teams;
    }

    public VenueModel setTeams(Set<TeamModel> teams) {
        this.teams = teams;
        return this;
    }
}

package com.personal.projects.footballstats_server.models;

import jakarta.persistence.*;

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

}

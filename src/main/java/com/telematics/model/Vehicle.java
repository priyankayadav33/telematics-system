package com.telematics.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin; // Vehicle Identification Number
    private String make;
    private String model;
    private int year;
    private double latitude;
    private double longitude;
    private double speed;
    private boolean engineOn;
}

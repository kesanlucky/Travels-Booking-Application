package com.example.Travels_back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private String vehicleName;
    private int seats;
    private String vehicleType;
    private String color;

    public Vehicle(String vehicleName, int seats, String vehicleType, String color) {
        this.vehicleName = vehicleName;
        this.seats = seats;
        this.vehicleType = vehicleType;
        this.color = color;
    }
}

package org.sesolutions.smartenergysolutionsbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "solar_live_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolarLiveData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double airTemperature;

    @Column
    private Double dni;

    @Column
    private Double ghi;

    @Column
    private Double azimuth;

    @Column
    private Double tilt;

    @Column
    private Boolean terrainShading;

    @Column
    private Boolean applyTrackerInactive;
}

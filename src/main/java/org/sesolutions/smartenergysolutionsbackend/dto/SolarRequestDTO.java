package org.sesolutions.smartenergysolutionsbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolarRequestDTO {
    private String latitude;
    private String longitude;
    private String azimuth;
    private String tilt;
    private String start;
    private String duration;
    private String format;
    private String time_zone;
}

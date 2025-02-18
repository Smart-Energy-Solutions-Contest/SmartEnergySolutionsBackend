package org.sesolutions.smartenergysolutionsbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolarResponseDTO {
    private Integer air_temp;
    private Integer dni;
    private Integer ghi;
    private String period_end;
    private String period;
}

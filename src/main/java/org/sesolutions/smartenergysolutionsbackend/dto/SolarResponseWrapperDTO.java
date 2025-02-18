package org.sesolutions.smartenergysolutionsbackend.dto;

import lombok.Data;

import java.util.List;

@Data
public class SolarResponseWrapperDTO {
    private List<SolarResponseDTO> estimated_actuals;
}

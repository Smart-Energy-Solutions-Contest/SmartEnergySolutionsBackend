package org.sesolutions.smartenergysolutionsbackend.controller;

import org.sesolutions.smartenergysolutionsbackend.dto.SolarRequestDTO;
import org.sesolutions.smartenergysolutionsbackend.dto.SolarResponseDTO;
import org.sesolutions.smartenergysolutionsbackend.service.SolarLiveDataService;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/solar")
@CrossOrigin
public class SolarLiveDataController {
    private final SolarLiveDataService solarLiveDataService;

    public SolarLiveDataController(SolarLiveDataService solarLiveDataService) {
        this.solarLiveDataService = solarLiveDataService;
    }

    @PostMapping("/live")
    public Flux<SolarResponseDTO> getLiveSolarLiveData(@RequestBody SolarRequestDTO solarRequestDTO) {
        return solarLiveDataService.getSolarData(solarRequestDTO);
    }
}

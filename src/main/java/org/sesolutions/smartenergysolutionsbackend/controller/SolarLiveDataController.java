package org.sesolutions.smartenergysolutionsbackend.controller;

import org.sesolutions.smartenergysolutionsbackend.dto.SolarResponseDTO;
import org.sesolutions.smartenergysolutionsbackend.service.SolarLiveDataService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/solar")
@CrossOrigin
public class SolarLiveDataController {
    private final SolarLiveDataService solarLiveDataService;

    public SolarLiveDataController(SolarLiveDataService solarLiveDataService) {
        this.solarLiveDataService = solarLiveDataService;
    }

//    @GetMapping("/live")
//    public void getLiveSolarLiveData() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setBearerAuth("7FkbI7yN0lXtgvviQVvfAUlUnWoy2fFp");
//
//        String URL = "https://api.solcast.com.au/data/historic/radiation_and_weather" +
//                "?latitude=-33.865143&longitude=151.209900&azimuth=44&tilt=90" +
//                "&start=2022-10-25T14%3A45%3A00.000Z&duration=P31D&format=json&time_zone=utc";
//
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        ResponseEntity<SolarResponseDTO> response = restTemplate.exchange(
//                URL, HttpMethod.GET, entity, SolarResponseDTO.class);
//    }
}

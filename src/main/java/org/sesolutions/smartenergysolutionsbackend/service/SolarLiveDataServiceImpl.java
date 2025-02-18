package org.sesolutions.smartenergysolutionsbackend.service;

import org.sesolutions.smartenergysolutionsbackend.dto.SolarRequestDTO;
import org.sesolutions.smartenergysolutionsbackend.dto.SolarResponseDTO;
import org.sesolutions.smartenergysolutionsbackend.dto.SolarResponseWrapperDTO;
import org.sesolutions.smartenergysolutionsbackend.entity.SolarLiveData;
import org.sesolutions.smartenergysolutionsbackend.repository.SolarLiveDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@Service
public class SolarLiveDataServiceImpl implements SolarLiveDataService {
    private final SolarLiveDataRepository solarLiveDataRepository;
    private final WebClient webClient;

    public SolarLiveDataServiceImpl(SolarLiveDataRepository solarLiveDataRepository, WebClient webClient) {
        this.solarLiveDataRepository = solarLiveDataRepository;
        this.webClient = webClient;
    }

    @Override
    public List<SolarLiveData> getAllSolarLiveData() {
        return solarLiveDataRepository.findAll();
    }

    @Override
    public Optional<SolarLiveData> getSolarLiveDataById(Integer id) {
        return solarLiveDataRepository.findById(id);
    }

    @Override
    public SolarLiveData createNewSolarLiveData(SolarLiveData solarLiveData) {
        return solarLiveDataRepository.save(solarLiveData);
    }

    @Override
    public void deleteSolarLiveDataById(Integer id) {
        solarLiveDataRepository.deleteById(id);
    }

    @Override
    public Flux<SolarResponseDTO> getSolarData(SolarRequestDTO solarRequestDTO) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("latitude", solarRequestDTO.getLatitude())
                        .queryParam("longitude", solarRequestDTO.getLongitude())
                        .queryParam("azimuth", solarRequestDTO.getAzimuth())
                        .queryParam("tilt", solarRequestDTO.getTilt())
                        .queryParam("start", URLDecoder.decode(solarRequestDTO.getStart(), StandardCharsets.UTF_8))
                        .queryParam("duration", solarRequestDTO.getDuration())
                        .queryParam("format", solarRequestDTO.getFormat())
                        .queryParam("time_zone", solarRequestDTO.getTime_zone())
                        .build())
                .retrieve()
                .bodyToMono(SolarResponseWrapperDTO.class)
                .flatMapMany(response -> Flux.fromIterable(response.getEstimated_actuals()));
    }
}

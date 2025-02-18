package org.sesolutions.smartenergysolutionsbackend.service;

import org.sesolutions.smartenergysolutionsbackend.entity.SolarLiveData;
import org.sesolutions.smartenergysolutionsbackend.repository.SolarLiveDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolarLiveDataServiceImpl implements SolarLiveDataService {
    private final SolarLiveDataRepository solarLiveDataRepository;

    public SolarLiveDataServiceImpl(SolarLiveDataRepository solarLiveDataRepository) {
        this.solarLiveDataRepository = solarLiveDataRepository;
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
}

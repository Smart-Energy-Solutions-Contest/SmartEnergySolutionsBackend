package org.sesolutions.smartenergysolutionsbackend.service;

import org.sesolutions.smartenergysolutionsbackend.entity.SolarLiveData;

import java.util.List;
import java.util.Optional;

public interface SolarLiveDataService {
    List<SolarLiveData> getAllSolarLiveData();
    Optional<SolarLiveData> getSolarLiveDataById(Integer id);
    SolarLiveData createNewSolarLiveData(SolarLiveData solarLiveData);
    void deleteSolarLiveDataById(Integer id);
}

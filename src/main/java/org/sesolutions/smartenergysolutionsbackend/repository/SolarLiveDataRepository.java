package org.sesolutions.smartenergysolutionsbackend.repository;

import org.sesolutions.smartenergysolutionsbackend.entity.SolarLiveData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolarLiveDataRepository extends JpaRepository<SolarLiveData, Integer> {
}

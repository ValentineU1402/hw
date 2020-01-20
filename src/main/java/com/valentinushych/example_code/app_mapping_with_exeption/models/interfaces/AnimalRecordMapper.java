package com.valentinushych.example_code.app_mapping_with_exeption.models.interfaces;

import com.valentinushych.example_code.app_mapping_with_exeption.models.AnimalRecord;

import java.util.Date;
import java.util.List;

public interface AnimalRecordMapper {
    AnimalRecord findByID(String id);
    List<AnimalRecord> listByAnimalType(String animalType);
    List<AnimalRecord> listByGroup(String group);
    List<AnimalRecord> listByShelter(String shelter);
    List<AnimalRecord> listByBread1(String brad1);
    List<AnimalRecord> listByDate(Date date);
    List<AnimalRecord> listByIntakeCondition(String status);

}

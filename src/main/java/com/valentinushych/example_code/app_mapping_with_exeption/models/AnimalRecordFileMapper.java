package com.valentinushych.example_code.app_mapping_with_exeption.models;


import com.valentinushych.example_code.app_mapping_with_exeption.exeptions.RecordNotFoundException;
import com.valentinushych.example_code.app_mapping_with_exeption.models.interfaces.AnimalRecordMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalRecordFileMapper implements AnimalRecordMapper {

    private List<AnimalRecord> animalRecords = new ArrayList<>();

    public AnimalRecordFileMapper() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Animal_Service_Record.csv"));
            String record = reader.readLine();
            while (record != null) {
                String[] str = record.split(",");
                animalRecords.add(new AnimalRecord(str[0], str[1], str[2], str[3], str[4], Animal.valueOf(str[5]), str[6], str[7], str[8]));
                record = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public AnimalRecord findByID(String id) {
        for (AnimalRecord record : animalRecords)
            if (record.getAnimalID().equalsIgnoreCase(id))
                return record;

        throw new RecordNotFoundException("Record with id " + id + " not found");
    }

    @Override
    public List<AnimalRecord> listByAnimalType(String animalType) {
        List<AnimalRecord> recordsByType = new ArrayList<>();
        for (AnimalRecord record : animalRecords)
            if (record.getAnimalType().toString().equalsIgnoreCase(animalType))
                recordsByType.add(record);

        return recordsByType;
    }

    @Override
    public List<AnimalRecord> listByGroup(String group) {
        List<AnimalRecord> recordsByGroup = new ArrayList<>();
        for (AnimalRecord record : animalRecords)
            if (record.getGroup().equalsIgnoreCase(group))
                recordsByGroup.add(record);

        return recordsByGroup;
    }

    @Override
    public List<AnimalRecord> listByShelter(String shelter) {
        List<AnimalRecord> recordsByShelter = new ArrayList<>();
        for (AnimalRecord record : animalRecords)
            if (record.getShelter().equalsIgnoreCase(shelter))
                recordsByShelter.add(record);

        return recordsByShelter;
    }

    @Override
    public List<AnimalRecord> listByBread1(String breed1) {
        List<AnimalRecord> recordsByBread1 = new ArrayList<>();
        for (AnimalRecord record : animalRecords)
            if (record.getBreed1().equalsIgnoreCase(breed1))
                recordsByBread1.add(record);

        return recordsByBread1;
    }

    @Override
    public List<AnimalRecord> listByDate(Date date) {
        List<AnimalRecord> recordsByDate = new ArrayList<>();

        String dateFormat = new SimpleDateFormat("MM/dd/yyyy").format(date);
        for (AnimalRecord record : animalRecords)
            if (record.getIntakeDate().equalsIgnoreCase(dateFormat))
                recordsByDate.add(record);

        return recordsByDate;
    }

    @Override
    public List<AnimalRecord> listByIntakeCondition(String status) {
        List<AnimalRecord> recordsByStatus = new ArrayList<>();

        for(AnimalRecord record : animalRecords){
            if(record.getIntakeCondition().equalsIgnoreCase(status)){
                recordsByStatus.add(record);
            }
        }

        return recordsByStatus;
    }

    public List<AnimalRecord> getAllAnimalServiceRecords() {
        return animalRecords;
    }

}

package com.valentinushych.example_code.app_mapping_with_exeption;

import com.valentinushych.example_code.app_mapping_with_exeption.models.AnimalRecord;
import com.valentinushych.example_code.app_mapping_with_exeption.models.AnimalRecordFileMapper;

import java.text.ParseException;
import java.util.List;
import java.util.UUID;

public class AppMapping {
    public static void main(String[] args) throws ParseException {
        AnimalRecordFileMapper mapper = new AnimalRecordFileMapper();

        List<AnimalRecord> records = mapper.listByAnimalType("bird");
        for(AnimalRecord rec : records){
            System.out.println(rec + "\n");
        }

        AnimalRecord record = mapper.findByID(UUID.randomUUID().toString());
    }
}

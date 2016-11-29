package registrationWithReflection.model;

import registrationWithReflection.model.entity.Record;

import java.util.ArrayList;

public class Model {
    private ArrayList<Record> listOfRecords = new ArrayList<>();

    @Override
    public String toString() {
        return "Model{" +
                "ListOfRecords=" + listOfRecords +
                '}';
    }

    public void addRecordToList(Record record){
        listOfRecords.add(record);
    }

    public boolean deleteRecordFromListOfRecords(Record record){
        return listOfRecords.remove(record);
    }
}

package workshopCLI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Buildings implements IBuildingManagementSystem {
    HashMap<UUID, Building> buildingHashMap;

    Buildings(){
    buildingHashMap = new HashMap<>();
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> buildingInformation = new HashMap<>();
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()){
            buildingInformation.put(entry.getKey(),entry.getValue().toString());
        }
        return buildingInformation;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> sensorInformation = new HashMap<>();
        Building building = buildingHashMap.get(buildingId);
        for(Map.Entry<UUID, Sensor> entry : building.sensorMap.entrySet()){
            sensorInformation.put(entry.getKey(), entry.getValue().toString());
        }
        return sensorInformation;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> actuatorInformation = new HashMap<>();
        Building building = buildingHashMap.get(buildingId);
        for(Map.Entry<UUID, Actuator> entry : building.actuatorMap.entrySet()){
            actuatorInformation.put(entry.getKey(), entry.getValue().toString());
        }
        return actuatorInformation;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        Sensor tempSensor = new TempSensor(name, Math.random()*10);
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()){
            if(buildingId == entry.getKey()){
                entry.getValue().sensorMap.put(tempSensor.getId(),tempSensor);
            }
        }
        return tempSensor.getId();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        Sensor tempSensor = new Co2Sensor(name, Math.random()*10);
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()){
            if(buildingId == entry.getKey()){
                entry.getValue().sensorMap.put(tempSensor.getId(),tempSensor);
            }
        }
        return tempSensor.getId();
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()){
            if(buildingId == entry.getKey()){
                entry.getValue().sensorMap.remove(sensorId);
            }
        }
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        Actuator actuator = new Ventilator(name, Math.random()*10);
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()){
            if(buildingId == entry.getKey()){
                entry.getValue().actuatorMap.put(actuator.getId(),actuator);
            }
        }
        return actuator.getId();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        for(Map.Entry<UUID, Building> entry : buildingHashMap.entrySet()) {
            if (buildingId == entry.getKey()) {
                entry.getValue().actuatorMap.remove(actuatorId);
            }
        }
    }

    public static void main(String[] args) {

     Building building = new Building("Bygning_1");

     Buildings buildings = new Buildings();

     buildings.buildingHashMap.put(building.getId(),building);


     UUID uuid_tempSensor_1_1 = buildings.addTemperatureSensor(building.getId(),"TempSensor_1.1");

     buildings.buildingHashMap.put(building.getId(),building);

     System.out.println(buildings.getSensorInformation(building.getId()));

     buildings.removeSensor(building.getId(), uuid_tempSensor_1_1);

     System.out.println(buildings.getSensorInformation(building.getId()));


    }
}

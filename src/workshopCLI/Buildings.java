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
        return buildingHashMap;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {

    }

    @Override
    public String toString() {
        return "{" +
                "buildings=" + buildings +
                '}';
    }
}

package workshopCLI;

import java.util.*;

public class Building extends Unit{
    Map<UUID, Sensor> sensorMap;
    Map<UUID, Actuator> actuatorMap;

    Building(String name, UUID id) {
        super(name, id);
        sensorMap = new HashMap<>();
        actuatorMap = new HashMap<>();
    }


    @Override
    public String toString() {
        return "Building{" +
                "name=" +getName() +
                "sensors=" + sensorMap.toString() +
                ", actuators=" + actuatorMap.toString() +
                '}';
    }
}

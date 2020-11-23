package workshopCLI;

import java.util.*;

public class Building extends Unit{
    Map<UUID, Sensor> sensorMap;
    Map<UUID, Actuator> actuatorMap;

    Building(String name) {
        super(name);
        sensorMap = new HashMap<>();
        actuatorMap = new HashMap<>();
    }


    @Override
    public String toString() {
        return " {" +
                " name = " +getName() +
                ", sensors = " + sensorMap.toString() +
                " and actuators = " + actuatorMap.toString() +
                '}';
    }
}

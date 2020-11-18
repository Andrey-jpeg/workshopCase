package workshopCLI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Room {
    private String name;
    private ArrayList<Sensor> sensors;
    private ArrayList<Actuator> actuators;

    Room() {
    this.name = "Stue";
    Co2Sensor co2Sensor = new Co2Sensor("rum sensor", Math.random()*10);
    Co2Sensor co2Sensor1 = new Co2Sensor("rum sensor", Math.random()*10);
    TempSensor tempSensor = new TempSensor("temperatur sensor", Math.random()*10);
    Ventilator ventilator = new Ventilator("Rum ventilator", Math.random()*10);
    sensors = new ArrayList<>(Arrays.asList(co2Sensor, co2Sensor1, tempSensor));
    actuators = new ArrayList<>(Collections.singletonList(ventilator));
    }


    Room(String name ){
        this.name = name;
        sensors = new ArrayList<Sensor>();
        actuators = new ArrayList<Actuator>();
    }

    public String getName() {
        return name;
    }

    public void removeSensor(Sensor sensor){
        sensors.remove(sensor);
    }

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }

    public void removeActuator(Actuator actuator){
        actuators.remove(actuator);
    }

    public void addActuator(Actuator actuator){
        actuators.add(actuator);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", sensors=" + sensors +
                ", actuators=" + actuators +
                '}';
    }
}

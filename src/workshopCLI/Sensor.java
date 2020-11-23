package workshopCLI;

import java.util.UUID;

public abstract class Sensor extends Unit{
    private double value;

    public Sensor(String name, double value) {
        super(name);
        this.value = value;
    }

    public double getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + getName() + '\'' +
                ", value=" + value +
                '}';
    }
}

class Co2Sensor extends Sensor{
    public Co2Sensor(String name, double value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "Co2Sensor{" +
                "name='" + getName() + '\'' +
                ", value=" + getValue() +
                '}';
    }
}

class TempSensor extends  Sensor {
    public TempSensor(String name, double value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "TempSensor{" +
                "name='" + getName() + '\'' +
                ", value=" + getValue() +
                '}';
    }
}

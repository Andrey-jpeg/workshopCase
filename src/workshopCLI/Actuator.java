package workshopCLI;

import java.util.UUID;

public abstract class Actuator extends Unit{
    private String name;
    private double value;

    Actuator(String name, double value) {
        super(name);
        this.value = value;
    }

    public void setValue(double newValue) {
        this.value = newValue;
    }

    public double getValue() {
        return value;
    }
}

class Ventilator extends Actuator {
    Ventilator(String name, double value){
        super(name, value);
    }


    @Override
    public void setValue(double newValue) {
        super.setValue(newValue);
    }

    @Override
    public String toString() {
        return "Actuator{" +
                "name='" + getName() + '\'' +
                ", value=" + getValue() +
                '}';
    }
}





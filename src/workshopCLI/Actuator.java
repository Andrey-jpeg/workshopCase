package workshopCLI;

public abstract class Actuator {
    private String name;
    private double value;

    Actuator(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void setValue(double newValue) {
        this.value = newValue;
    }

    public String getName() {
        return name;
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

    public static void main(String[] args) {
        Ventilator v1 = new Ventilator("bedroomVentilator", 69);

        System.out.println(v1.toString());
    }
}





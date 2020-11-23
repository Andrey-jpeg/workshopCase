package workshopCLI;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;

    Unit(){
        this.name = "";
        this.id = UUID.randomUUID();
    }

    public Unit(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

package workshopCLI;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id = UUID.randomUUID();

    Unit(){
        this.name = "";
        this.id = getId();
    }

    public Unit(String name) {
        this.name = name;
        id = getId();
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

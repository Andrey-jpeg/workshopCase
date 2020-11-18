package workshopCLI;

import java.util.ArrayList;

public class Buildings {
    private ArrayList<Building> buildings;

    Buildings(){
        buildings = new ArrayList<Building>();
    }

    public ArrayList<Building> getBuildings(){
        return buildings;
    }

    public void removeBuildings(Building building){
        buildings.remove(building);
    }

    public void addBuildings(Building building){
        buildings.add(building);
    }

    @Override
    public String toString() {
        return "{" +
                "buildings=" + buildings +
                '}';
    }

    public static void main(String[] args) {
        Room room = new Room();
        Building building = new Building("Brenderupvej 122", room);
        Buildings buildings = new Buildings();

        buildings.addBuildings(building);
        building.getRoomName();

    }
}

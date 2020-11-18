package workshopCLI;

import java.util.ArrayList;
import java.util.Collections;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    Building(String name) {
        this.name = name;
        rooms = new ArrayList<Room>();
    }

    Building(String name, Room room) {
        this.name = name;
        rooms = new ArrayList<Room>(Collections.singleton(room));
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void getRoomName(){
        for (Room room: rooms) {
            System.out.println(room.getName() + " ");

        }
    }

    @Override
    public String toString() {
        return "building{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}

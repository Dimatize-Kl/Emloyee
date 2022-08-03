package New020822;

public class HourTest {

    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(false);

        Flat flat1 = new Flat(1, new Room[]{room1, room2, room3});
        Flat flat2 = new Flat(1, new Room[]{room1, room2, room3});
        Flat flat3 = new Flat(1, new Room[]{room1, room2, room3});

        Floor floor1 = new Floor(1,new Flat[]{flat1,flat2,flat3});
        Floor floor2 = new Floor(1,new Flat[]{flat1,flat2,flat3});
        Floor floor3 = new Floor(1,new Flat[]{flat1,flat2,flat3});

        House house1 = new House(1, new Floor[]{floor1,floor2,floor3});

        printAllInformation(house1);

    }

    public static void printAllInformation(House house){
        house.print();

    }
}

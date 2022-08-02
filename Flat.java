package New020822;

public class Flat {

    private int number;
    private Room[] room;

    public Flat(int number, Room[] room) {
        this.number = number;
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRoom() {
        return room;
    }

    public void print() {
        System.out.println("Данная квартира имеет номер " + getNumber() + " и имеет " + getRoom().length + " комнат");

    }
}

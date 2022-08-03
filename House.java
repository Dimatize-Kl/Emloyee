package New020822;

public class House {

    private int number;
    private Floor[] floor;

    public House(int number, Floor[] floor) {
        this.number = number;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloor() {
        return floor;
    }

    public void print() {
        System.out.println("Дом номер " + getNumber() + ", он имеет " + getFloor().length + " этажей");
        floor[0].print();
    }
}

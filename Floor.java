package New020822;

public class Floor {

    private int floor;
    private Flat[] flat;

    public Floor(int floor, Flat[] flat){
        this.floor = floor;
        this.flat = flat;
    }

    public int getFloor() {
        return floor;
    }

    public Flat[] getFlat() {
        return flat;
    }

    public void print() {
        System.out.println("Этаж номер " + getFloor() + ", на нем находится " + getFlat().length + " квартир");
        flat[0].print();
    }
}

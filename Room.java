package New020822;

public class Room {
    private boolean pass;

    public Room(boolean pass) {
        this.pass = pass;
    }

    public boolean getPass() {
        return pass;
    }

    public void print() {
        if (getPass()) {
            System.out.println("Эта комната проходная");
        } else {
            System.out.println("Эта комната не проходная");
        }
    }

}

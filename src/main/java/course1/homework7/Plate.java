package course1.homework7;

public class Plate {
    private int food;

    public void info() {
        System.out.println("В миске " + food + " еды.");
    }

    public void decrease(int appetite) {
        food -= appetite;
    }

    public void increase(int food) {
        this.food += food;
    }

    public int getFood() {
        return food;
    }
}

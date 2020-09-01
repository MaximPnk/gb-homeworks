package course3.homework1.task3;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        System.out.println(appleBox1.compare(appleBox));
        appleBox1.add(new Apple());
        System.out.println(appleBox.compare(appleBox1));

        appleBox.pour(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }
}

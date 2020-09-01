package course1.homework7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.increase(80);
        Cat[] cats = new Cat[5];
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот №" + (i+1), (int) (Math.random()*20+10));
            System.out.println(cats[i]);
            cats[i].eat(plate);
            System.out.println(cats[i]);
            plate.info();
        }
    }
}

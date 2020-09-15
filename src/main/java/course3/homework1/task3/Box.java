package course3.homework1.task3;

import java.util.ArrayList;

public class Box<E extends Fruit> {
    private ArrayList<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    public Float getWeight() {
        if (list != null && list.size() != 0) {
            return list.get(0).getWeight()*list.size();
        } else {
            return 0f;
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001f;
    }

    public void pour(Box<E> box) {
        box.list.addAll(this.list);
        this.list.clear();
    }
}

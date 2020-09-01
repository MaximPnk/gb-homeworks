package course3.homework1.task3;

import java.util.ArrayList;

public class Box<E> {
    private ArrayList<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    public Float getWeight() {
        if (list != null && list.size() != 0) {
            if (list.get(0) instanceof Apple) {
                return 1.0f*list.size();
            } else {
                return 1.5f*list.size();
            }
        } else {
            return 0f;
        }
    }

    public boolean compare(Box<E> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001f;
    }

    public void pour(Box<E> box) {
        box.list.addAll(this.list);
        this.list.clear();
    }
}

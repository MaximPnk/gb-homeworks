package course1.homework8.task7;

public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        MyStringBuilder my = new MyStringBuilder(string);

        my.append("one ");
        my.append("two ");
        my.append(1);
        my.append(" three ");
        my.append("four ");
        my.append("five ");
        System.out.println(my.toString());
        my = my.undo();
        System.out.println(my.toString());
        my = my.undo();
        System.out.println(my.toString());
        my = my.undo();
        System.out.println(my.toString());
        my = my.undo();
        System.out.println(my.toString());
        my = my.undo();
        System.out.println(my.toString());
    }
}

package homework8.task2;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.println(i);
                }
            }
        }
    }
}

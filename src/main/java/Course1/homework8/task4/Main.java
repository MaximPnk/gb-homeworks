package Course1.homework8.task4;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2 ,3};
        int[] weights = {1, 5, 10};
        Random random = new Random(values, weights);
        for (int i = 0; i < 50; i++) {
            random.Calculate();
        }
    }
}

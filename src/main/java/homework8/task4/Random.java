package homework8.task4;

public class Random {
    private int[] values;
    private int[] weights;

    public Random(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
    }

    public void Calculate() {
        int sumWeights = 0;
        double random = Math.random();
        for (int i = 0; i < weights.length; i++) {
            sumWeights += weights[i];
        }
        for (int i = 0; i < values.length; i++) {
            if (weights[i]*1.0/sumWeights >= random) {
                System.out.print(values[i] + " ");
                return;
            } else {
                sumWeights -= weights[i];
            }
        }
    }
}

package course1.homework8.task3;

public class Task3v1 {

    public static void main(String[] args) {

        //через сдвиг

        int[] numArray = new int[25];
        int value = 5;

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 9 + 1);
            System.out.print(numArray[i] + " ");
        }

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == value) {
                numArray[i] = 0;
                for (int j = i; j < numArray.length-1; j++) {
                    int tmp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
    }
}

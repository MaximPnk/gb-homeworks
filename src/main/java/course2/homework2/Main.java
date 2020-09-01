package course2.homework2;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {

        String[][] strArr = new String[4][4];
        int num = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = String.valueOf(num++);
            }
        }
//        strArr[1][3] = "asd";
//        strArr[0][0] = "s";

        try {
            System.out.println("Сумма всех ячеек массива = " + sumOfStrArray(strArr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumOfStrArray(String[][] arr) {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        /*
         * Можно забегая вперед сделать таким способом вместо try-catch

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Pattern p = Pattern.compile("\\D");
                Matcher m = p.matcher(arr[i][j]);
                if (m.find()) {
                    throw new MyArrayDataException(i, j);
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
         *
         */

        return sum;
    }
}

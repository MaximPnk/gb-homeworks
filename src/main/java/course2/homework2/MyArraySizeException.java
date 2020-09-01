package course2.homework2;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Длина массива не равна 4");
    }
}

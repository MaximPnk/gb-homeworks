package Course2.homework2;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int a, int b) {
        super(String.format("Ячейку [%d][%d] невозможно преобразовать в Integer", a, b));
    }
}

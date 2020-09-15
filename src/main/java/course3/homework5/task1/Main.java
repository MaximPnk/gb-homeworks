package course3.homework5.task1;

public class Main {
    private static volatile char threadChar = 'A';
    private final static Object o = new Object();

    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool();
        myThreadPool.createThreads();
    }
}

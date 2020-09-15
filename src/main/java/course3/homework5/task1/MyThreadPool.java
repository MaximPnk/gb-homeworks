package course3.homework5.task1;

public class MyThreadPool {
    private static volatile char threadChar = 'A';

    public void createThreads() {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                print('A');
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                print('B');
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                print('C');
            }
        }).start();
    }

    public synchronized void print(char str) {
        while (threadChar != str) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (str == 'A') {
            System.out.print('A');
            threadChar = 'B';
            notifyAll();
        } else if (str == 'B') {
            System.out.print('B');
            threadChar = 'C';
            notifyAll();
        } else if (str == 'C') {
            System.out.print('C');
            threadChar = 'A';
            notifyAll();
        }
    }
}

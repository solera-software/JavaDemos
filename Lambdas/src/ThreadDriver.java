/**
 * Uses a lambda to print 1-10 in a separate thread.
 */
public class ThreadDriver {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + i);
            }
        }).start();
    }
}

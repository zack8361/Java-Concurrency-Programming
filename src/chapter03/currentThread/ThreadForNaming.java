package chapter03.currentThread;

public class ThreadForNaming {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
    }
    private static class ThreadName implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

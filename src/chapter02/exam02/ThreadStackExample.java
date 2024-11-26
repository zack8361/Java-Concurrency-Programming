package chapter02.exam02;

public class ThreadStackExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            new Thread(new MyRunnable(i)).start();
        }
    }

    static class MyRunnable implements Runnable {

        private final int threadId;

        public MyRunnable(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " 실행중...");
            firstMethod(threadId);
        }

        public void firstMethod(int threadId) {
            int localValue = threadId + 100;
            secondMethod(localValue);
        }

        private void secondMethod(int localValue) {
            System.out.println(Thread.currentThread().getName() + " : " + localValue);
        }
    }
}

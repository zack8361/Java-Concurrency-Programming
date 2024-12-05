package chapter04.flag;

public class InterruptExceptionExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }

    public static class MyRunnable implements Runnable {

        @SuppressWarnings("BusyWait")
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Thread is Running..");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
    }
}

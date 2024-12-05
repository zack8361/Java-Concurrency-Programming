package chapter04.flag;

/**
 * 플래그 변수는 동시성 문제로 가능한 atomic 변수나 Volatile 키워드를 사용하도록 함.
 */
public class FlagExample01 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable flagThread = new MyRunnable();
        Thread thread = new Thread(flagThread);
        thread.start();
        Thread.sleep(3000);
        flagThread.stop(false);
    }

    public static class MyRunnable extends Thread {
        private volatile boolean running = true;

        public void stop(boolean running) {
            this.running = running;
        }

        @Override
        public void run(){
            while (running){
                System.out.println("running");
            }
        }
    }
}


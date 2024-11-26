package chapter02.exam01;

public class ImplementRunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}


class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable.run()");
    }
}
package chapter02;

/**
 * v1
 * 쓰레드 클래스를 상속하는 방법.
 */
public class ExtendThreadExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "스레드 실행중입니다..");
    }

}
package chapter04.ThreadGroup;

public class Ex02 {

    public static void main(String[] args) throws InterruptedException {

        // 최상위 스레드 그룹 생성
        ThreadGroup topGroup = new ThreadGroup("최상위 스레드 그룹");
        ThreadGroup subGroup = new ThreadGroup(topGroup, "하위 스레드 그룹");

        // 스레드 생성
        new Thread(topGroup,new MyRunnableClass(), "최상위 스레드").start();
        new Thread(subGroup,new MyRunnableClass(), "하위 스레드").start();

        Thread.sleep(1000);
        System.out.println("-------------------- 스레드 그룹 리스트 --------------------");
        System.out.println("최상위 그룹의 정보");
        topGroup.list();
    }

    private static class MyRunnableClass implements Runnable {
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + "/" + Thread.currentThread().getThreadGroup().getName());
        }
    }
}

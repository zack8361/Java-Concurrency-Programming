package chapter04.ThreadGroup;

public class Ex01 {
    public static void main(String[] args) {

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup customThreadGroup = new ThreadGroup("Custom Thread Group");


        //-------------------- ThreadGroup 생성자를 이용한 방법 --------------------//

        Thread defaultGroupThread= new Thread(new GroupRunnable(), "DefaultGroupThread");
        Thread mainGroupThread = new Thread(mainThreadGroup, new GroupRunnable(), "MainGroupThread");
        Thread customGroupThread = new Thread(customThreadGroup, new GroupRunnable(), "CustomGroupThread");

        defaultGroupThread.start();
        mainGroupThread.start();
        customGroupThread.start();
    }

    private static class GroupRunnable implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()  + "/" + thread.getThreadGroup().getName());
        }
    }
}

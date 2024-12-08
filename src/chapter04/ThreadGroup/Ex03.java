package chapter04.ThreadGroup;

public class Ex03 {
    public static void main(String[] args) {

        // 그룹 생성
        ThreadGroup topGroup = new ThreadGroup("상위 스레드 그룹");
        ThreadGroup subGroup = new ThreadGroup(topGroup,"하위 스레드 그룹");

        new Thread(topGroup, () -> {
            System.out.println("상위 그룹 스레드에서 하위 그룹의 " +
                    "스레드 그룹에 대한 우선순위 변경 전 : "
                    + subGroup.getMaxPriority());
            subGroup.setMaxPriority(7);
            System.out.println("상위 그룹 스레드에서 하위 그룹의 " +
                    "스레드 그룹에 대한 우선순위 변경 후 : "
                    + subGroup.getMaxPriority());
        }, "상위 스레드").start();


    }
}

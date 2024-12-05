package chapter03.interrupted;

import java.util.ArrayList;
import java.util.List;

public class InterruptedExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        try {
            System.out.println(list.get(1));
        }
        catch (Exception e) {

        }
        System.out.println("hi");
    }
}

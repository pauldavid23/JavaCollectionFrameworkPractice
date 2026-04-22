import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>(10);
        ArrayList<Integer> j = new ArrayList<>(List.of(10,20,30,40));

        i.add(10);
        i.add(0,1);
        i.add(1,2);


        System.out.println(i);
        System.out.println(j);


    }
}
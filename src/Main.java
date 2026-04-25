import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        LinkedList<Integer> j = new LinkedList<>(List.of(10,20,30,40));

        //i.add(10);
        i.add(0,1);
        i.add(1,2);
        i.addAll(j);

        i.addFirst(0);
        i.addLast(50);


        System.out.println(i);
        System.out.println(j);



    }
}
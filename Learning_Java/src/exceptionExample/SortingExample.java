package exceptionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {

    public static void main(String[]args){
        List<String> names = new LinkedList<String>();

        names.add("Kelly");
        names.add("Maria");
        names.add("Harry");

        // Before sorting
        System.out.println("-------Not Sorted --------");
        for (String name : names){
            System.out.println(name);
        }

        Collections.sort(names);
        System.out.println("----------Sorted-------------");
        // After sorting
        for (String name: names){
            System.out.println(name);
        }
    }
}

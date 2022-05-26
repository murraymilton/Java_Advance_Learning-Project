package iteratorExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExercise {

    public static void main(String[]args){
        List<String> names = new LinkedList<String>();
        names.add("Tommy");
        names.add("Jerry");
        names.add("Joseph");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

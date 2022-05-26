package collectionsExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionsExercise {

    public static void main(String[]args){
        List<String> listOfItems = new LinkedList<String>();
        listOfItems.add("Notebook");
        listOfItems.add("Laptop");
        listOfItems.add("Programming An Induction to Greatness");
        
        for(String list : listOfItems){
            System.out.println(list);
        }
    }
}

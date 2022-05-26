package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[]args){

        Map<String,Person>mapOfPeople = new HashMap<>();
        Person timothy = new Person("Timothy","timothy@poki.com");
        Person jenny = new Person("Jenny","jenny@poki.com");
        Person rebecca = new Person("Rebecca","rebecca@poki.com");
        Person charles = new Person("Charles","charles@poki.com");
        Person david = new Person("David","david@poki.com");


        ArrayList<Person> people = new ArrayList<>();
        people.add(timothy);
        people.add(jenny);
        people.add(rebecca);
        people.add(charles);
        people.add(david);

        for (Person person : people){
            MapExercise.addToMap(mapOfPeople,person);
        }

      for (String email : mapOfPeople.keySet()){
          System.out.println(email);
      }
      for (Person person : mapOfPeople.values()){
          System.out.println(person);
      }
        System.out.println("Get Timothy: " + mapOfPeople.get("timothy@poki.com"));
        System.out.println("Get Jenny: " + mapOfPeople.get("jenny@poki.com"));
        System.out.println("Get Rebecca: " + mapOfPeople.get("rebecca@poki.com"));
        System.out.println("Get Charles: " + mapOfPeople.get("charles@poki.com"));
        System.out.println("Get David: " + mapOfPeople.get("david@poki.com"));


    }
    private static void addToMap(Map<String, Person> map, Person person){
        map.put(person.getEmail(),person);
    }
}

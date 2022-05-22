package inheritanceExample;

public class PersonTester {
    public static void main(String[]args){
        Person sally = new Person("Sally","Phillips");
        System.out.println(sally);
        Student mike = new Student("Mike", "Thompson","984563");
        System.out.println(mike);
        StudentEmployee jeff = new StudentEmployee("Jeff","Newhouse",
                "6464525",95.50);
        System.out.println(jeff);
    }
}

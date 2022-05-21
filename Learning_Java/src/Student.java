public class Student {
    private final String id;
    private final String firstName;
    private final String lastName;

    /**
     * The constructor for the student class
     * @param id
     * @param firstName
     * @param lastName
     */
    public Student(String id, String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * The get methods for returning the given strings for the state variable
     * @return
     */
    public String getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}

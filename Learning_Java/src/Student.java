public class Student {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String courseName;

    /**
     * The constructor for the student class
     * @param id
     * @param firstName
     * @param lastName
     */
    public Student(String id, String firstName,String lastName, String courseName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
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
        return
                lastName;
    }

    public String getCourseName(){
        return courseName;
    }
}

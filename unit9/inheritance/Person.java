package unit9.inheritance;

/**
 * Created by rebeccaxu on 5/9/17.
 */
public abstract class Person {
    private static int personcount = 0;
    protected String firstName;
    protected String lastName;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String getGreeting();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

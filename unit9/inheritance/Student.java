package unit9.inheritance;

/**
 * Created by rebeccaxu on 5/9/17.
 */
public class Student extends Person {
    private int yearOfGraduation;

    public Student (String firstName, String lastName, int yearOfGraduation) {
        super(firstName, lastName);
        this.yearOfGraduation = yearOfGraduation;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String toString() {
        return ("Student: " + firstName + " " + lastName + " - " + yearOfGraduation);
    }

    @Override
    public String getGreeting() {
        return "Hi, I'm " + firstName;
    }
}

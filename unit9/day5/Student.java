package unit9.day5;

/**
 * Created by rebeccaxu on 4/20/17.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String academy;
    private int classYear;

    public Student(String firstName, String lastName, String academy, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academy = academy;
        this.classYear = classYear;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals (Object o) {
        Student s = (Student) o;

        if (s.lastName.equals(lastName) && (s.firstName.equals(firstName))) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return (firstName + " " + lastName + " - " + academy + " " + classYear  + " ");
    }
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

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
}

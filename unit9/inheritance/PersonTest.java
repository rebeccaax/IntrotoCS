package unit9.inheritance;

/**
 * Created by rebeccaxu on 5/9/17.
 */
public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student ("Jeffery", "Beane", 2020);
        Teacher t = new Teacher ("Graham","Watkins", "Mathematics");
        t.setLastName ("Wakins");
        System.out.println(s);
        System.out.println(s.getGreeting());
        System.out.println(t);
        System.out.println(t.getGreeting());
    }
}

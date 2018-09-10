package unit9.day5;

/**
 * Created by rebeccaxu on 4/20/17.
 */
public class ClubTester {
    public static void main(String[] args) {
        Student s1 = new Student ("Rebecca", "Xu", "ATCS", 2020);

        Club c = new Club("CTF", "Mr.Isecke", Club.AFTERNOON);
        c.addStudent(s1);
        c.addStudent("Ethan", "Herbst");
        c.addStudent("Hannah", "Ahn");
        c.addStudent("Greg", "Latronica");
        c.addStudent("Santi", "Freeman");

        System.out.println(c);

        c.deleteStudent(2);
        System.out.println("\n\nStudent Deleted!");
        System.out.println(c);

    }
}

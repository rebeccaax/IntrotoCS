package unit9.day5;

/**
 * Created by rebeccaxu on 4/20/17.
 */
public class Club {
    public static final int MORNING = 0;
    public static final int AFTERNOON = 1;
    private String name;
    private String advisor;
    private int type;
    private int numStudents = 0;
    private Student [] students = new Student[2];

    public Club (String name, String advisor, int type) {
        this.name = name;
        this.advisor = advisor;
        this.type = type;
    }

    public void deleteStudent(int index) {
        for (int i = 0; i < numStudents-1; i++) {
            students[i] = students[i+1];
        }
        numStudents--;
    }

    public boolean deleteStudent (String firstName, String lastName){
        int i = indexOf (new Student (firstName, lastName));

        if (i == -1)
            return false;

        deleteStudent(i);
        return true;
    }

    public int indexOf(Student s) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].equals(s))
                return i;
        }
        return -1;
    }

    public void addStudent (Student s) {
        if (numStudents == students.length) {
            Student[] newArray = new Student [students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[i];
            }
            students = newArray;
        }

        students[numStudents++] = s;
    }

    public void addStudent (String firstName, String lastName) {
        addStudent(new Student (firstName, lastName));
    }

    public String toString () {
        String s = name + " - " + advisor + "\n";
        for (int i = 0; i < numStudents; i++) {
            s += "\t" + students[i] + "\n";
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}

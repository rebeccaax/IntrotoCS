package unit10.ex_12;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by rebeccaxu on 5/15/17.
 */
public class Ex12_5 extends JFrame {
    public Ex12_5() {
        Border lineBorder = new LineBorder(Color.BLACK, 2);
        setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
        JFrame frame = new JFrame("Exercise 12_5");

        JLabel department = new JLabel("Department of Computer Science");
        JLabel school = new JLabel("School of Computing");
        JLabel university = new JLabel("Armstrong Atlantic State University");
        JLabel telephone = new JLabel("Tel: (912) 921-6440");
        department.setBorder(lineBorder);
        school.setBorder(lineBorder);
        university.setBorder(lineBorder);
        telephone.setBorder(lineBorder);
        add(department);
        add(school);
        add(university);
        add(telephone);
    }

    public static void main(String[] args) {
        Ex12_5 frame = new Ex12_5();
        frame.setTitle("Exercise12_5");
        frame.setSize(230, 110);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

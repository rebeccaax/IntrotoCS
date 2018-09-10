package unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rebeccaxu on 6/9/17.
 */
public class Ex16_4 extends JFrame {
    JTextField number1 = new JTextField(0);
    JTextField number2 = new JTextField(0);
    JTextField result = new JTextField(0);

    JButton btnAdd = new JButton("Add");
    JButton btnSubtract = new JButton("Subtract");
    JButton btnMultiply = new JButton("Multiply");
    JButton btnDivide = new JButton("Divide");

    public Ex16_4() {
        JPanel p1 = new JPanel();
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        p1.add(new JLabel("Number 1"));
        p1.add(number1);

        p1.add(new JLabel("Number 2"));
        p1.add(number2);

        p1.add(new JLabel("Result"));
        result.setEditable(false);
        p1.add(result);

        setLayout (new BorderLayout());
        add (p1, BorderLayout.NORTH);
        add (btnAdd, BorderLayout.WEST);
        add (btnSubtract, BorderLayout.SOUTH);
        add (btnMultiply, BorderLayout.SOUTH);
        add (btnDivide, BorderLayout.EAST);

        btnAdd.addActionListener(new MyActionListener());
        btnSubtract.addActionListener(new MyActionListener());
        btnMultiply.addActionListener(new MyActionListener());
        btnDivide.addActionListener(new MyActionListener());
    }

    public static void main(String[] args) {
        Ex16_4 frame = new Ex16_4();
        frame.setTitle("Exercise 16_4");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(number1.getText());
            double num2 = Double.parseDouble(number2.getText());

            double add = num1 + num2;
            double subtract = num1 - num2;
            double multiply = num1 * num2;
            double divide = num1 / num2;

            result.setText(String.format("$%.2f", add));
            result.setText(String.format("$%.2f", subtract));
            result.setText(String.format("$%.2f", multiply));
            result.setText(String.format("$%.2f", divide));

        }
    }
}


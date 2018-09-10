package unit11;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by rebeccaxu on 6/8/17.
 */
public class Ex16_5 extends JFrame {
    JTextField txtInvestment = new JTextField(0);
    JTextField txtYears = new JTextField(0);
    JTextField txtInterest = new JTextField(0);

    JTextField txtOutput = new JTextField(0);

    JButton btnCalculate = new JButton("Calculate");

    public Ex16_5() {
        JPanel p1 = new JPanel();
        p1.setLayout (new GridLayout (4, 2));

        p1.add(new JLabel("Investment Amount"));
        p1.add(txtInvestment);

        p1.add(new JLabel("Years"));
        p1.add(txtYears);

        p1.add(new JLabel("Annual Interest Rate"));
        p1.add(txtInterest);

        p1.add(new JLabel("Future Value"));
        txtOutput.setEditable(false);
        p1.add(txtOutput);


       setLayout (new BorderLayout());
       add (p1, BorderLayout.NORTH);
       add (btnCalculate, BorderLayout.EAST);

       btnCalculate.addActionListener(new MyActionListener());
    }

    public static void main(String[] args) {
        Ex16_5 frame = new Ex16_5();
        frame.setTitle("Calculator");
        frame.setSize(300, 155);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            double p = Double.parseDouble(txtInvestment.getText());
            double years = Double.parseDouble(txtYears.getText());
            double r = Double.parseDouble(txtInterest.getText());

            double result = p * Math.pow(1 + r/1200, years * 12);

            txtOutput.setText(String.format("$%.2f", result));



        }

    }
}

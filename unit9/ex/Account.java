package unit9.ex;
import java.util.Date;
/**
 * Created by rebeccaxu on 4/17/17.
 */
public class Account {

    private Date d = new Date();
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    public Account () {
        this.id = 0;
        this.balance = 0;
        annualInterestRate = 0;
    }

    public Account (int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public String toString () {
        return ("Balance: " + balance + "Monthly Interest Rate: " + annualInterestRate + "Creation Date: " + dateCreated);
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate (double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}

package unit7;

import java.util.Scanner;

/**
 * Created by rebeccaxu on 2/2/17.
 */
public class day5_teams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your favorite team?");
        String team = input.nextLine();

        if (team.equals("Giants")) {
            System.out.println("Me too!");

        }
        else if (team.equals("Cowboys")) {
            System.out.println(("I don't like you"));

        }
        else {
            System.out.println("Okay");

        }

        input.close();

    }
}

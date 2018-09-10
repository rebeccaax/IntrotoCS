package unit7;
import java.util.Scanner;

public class day2_area_of_polygons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of your polygon?");
        String name = input.nextLine();

        System.out.println ("How many sides are there?");
        int sides = input.nextInt();

        System.out.println("How long is each side?");
        double length = input.nextDouble();

        double p = sides * length;

        System.out.println ("Your " + name + " has a perimeter of " + p + ".");
    }
}






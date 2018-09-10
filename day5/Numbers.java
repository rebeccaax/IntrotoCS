package day5;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rebeccaxu on 6/16/17.
 */
public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <> () ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers. Enter 0 as your last number.");

        int num = in.nextInt();
        while (num != 0) {
            list.add(num);
            num = in.nextInt();
        }

        for (int i = list.size() - 1 ; i >= 0; i--) {
            System.out.println(list.get(i));

        }

        list.remove(1);
        System.out.println("After removed position 1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

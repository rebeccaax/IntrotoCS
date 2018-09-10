package unit8;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
import java.util.Random;
/**
 * Created by rebeccaxu on 2/24/17.
 */
public class day2_password_generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("How many characters should the password be?");
        int length = input.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int n = r.nextInt(62);

            if (n < 26)
                password += (char)('A' + n);

            else if (n < 52)
                password += (char)('a' + (n - 26));

            else
                password += (char)('0' + (n - 52));

        }

        System.out.println(password);

    }
}

package unit9.capitals;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by rebeccaxu on 5/1/17.
 */
public class StateCapitalList {
    private StateCapital[] list = new StateCapital[50];
    public int states = 0;

    public StateCapitalList(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(fileName));

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] a = line.split("\t");
            StateCapital b = new StateCapital(a[0], a[1]);

            list[states] = b;
            states++;
        }
    }

    public StateCapital getRandomState() {
        Random r = new Random();
        return list[r.nextInt(states)];
    }

    public int statesRemaining() {
        return states;
    }

    public void remove(StateCapital sc) {
        int index = -1;

        for (int i = 0; i < states; i++) {
            if ((list [i]).equals(sc)) {
                index = i;
            }

        }

        for (int i = index; i < states - 1; i++) {
            list[i] = list[i+1];
        }
        states--;
    }


}

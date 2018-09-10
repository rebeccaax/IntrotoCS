package unit9.capitals;
import java.util.Scanner;
import java.io.*;
/**
 * Created by rebeccaxu on 5/1/17.
 */
public class StateCapital {
    private String state;
    private String capital;

    public StateCapital (String state, String capital) {
        this.state = state;
        this.capital = capital;
    }

    public boolean equals (Object o) {
        StateCapital a = (StateCapital)o;
        return state.equals(a.state) && this.capital.equals(a.capital);
    }

    public String getState() {
        return state;
    }

    public String getCapital() {
        return capital;
    }
}

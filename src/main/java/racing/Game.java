package racing;

import java.util.List;

public class Game {

    public void run() {
        List<String> names = UserInterface.getNames();
        System.out.println("names = " + names);
    }
}

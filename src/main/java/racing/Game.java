package racing;

import java.util.List;

public class Game {

    public void run() {
        UserInterface.promptCarNames();
        List<String> names = UserInterface.getNames();
        System.out.println("names = " + names);
    }
}

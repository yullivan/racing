package racing;

import java.util.List;

public class Game {

    public void run() {
        List<CarName> carNames = UserInterface.getCarNames();
        System.out.println("carNames = " + carNames);
    }
}

package racing;

import java.util.List;
import java.util.Random;

public class Game {

    Random random = new Random();

    public void run() {
        List<CarName> carNames = UserInterface.getCarNames();

        System.out.println("carNames = " + carNames);
    }

    public int getRandomNumber() {
        return random.nextInt(6) + 1;
    }
}

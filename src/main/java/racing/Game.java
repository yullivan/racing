package racing;

import java.util.Random;

public class Game {

    private static Random random = new Random();

    public void run() {
        Cars cars = UserInterface.getCars();
        DriveCount driveCount = UserInterface.getDriveCount();

        for (int i = 0; i < driveCount.getCount(); i++) {
            cars.driveAll();
            UserInterface.printResult(cars);
        }

        // 우승자 출력
        Cars winners = cars.getWinners();
        UserInterface.printWinners(winners);
    }

    public static int getRandomNumber() {
        return random.nextInt(6) + 1;
    }
}

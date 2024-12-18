package racing;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {

    private static Random random = new Random();

    public void run() {
        Cars cars = UserInterface.getCars();
        int driveCount = 5;

        for (int i = 0; i < driveCount; i++) {
            cars.driveAll();
            UserInterface.printResult(cars);
        }

        // 우승자 출력
        Cars winners = getWinners(cars);
        UserInterface.printWinners(winners);
    }

    private Cars getWinners(Cars cars) {
        List<Integer> distances = cars.getCars()
                .stream()
                .map(car -> car.getDistance())
                .toList();

        Integer maxDistance = Collections.max(distances);

        return new Cars(cars.getCars()
                .stream()
                .filter(car -> car.getDistance() == maxDistance)
                .toList());
    }

    private void driveAll(List<Car> cars) {
        for (Car car : cars) {
            car.drive(getRandomNumber());
        }
    }

    public static int getRandomNumber() {
        return random.nextInt(6) + 1;
    }
}

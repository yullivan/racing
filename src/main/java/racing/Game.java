package racing;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {

    Random random = new Random();

    public void run() {
        List<CarName> carNames = UserInterface.getCarNames();
        List<Car> cars = carNames.stream()
                .map(carName -> new Car(carName, 0))
                .toList();
        int driveCount = 10;

        for (int i = 0; i < driveCount; i++) {
//            for (Car car : cars) {
//                car.drive(getRandomNumber());
//            }
            driveAll(cars);
            UserInterface.printResult(cars);
        }

        // 우승자 출력
        List<Car> winners = getWinners(cars);
        UserInterface.printWinners(winners);
    }

    private List<Car> getWinners(List<Car> cars) {
        List<Integer> distances = cars.stream()
                .map(car -> car.getDistance())
                .toList();

        Integer maxDistance = Collections.max(distances);

        return cars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .toList();
    }

    private void driveAll(List<Car> cars) {
        for (Car car : cars) {
            car.drive(getRandomNumber());
        }
    }

    public int getRandomNumber() {
        return random.nextInt(6) + 1;
    }
}

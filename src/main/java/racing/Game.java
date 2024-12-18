package racing;

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
            for (Car car : cars) {
                car.drive(getRandomNumber());
            }
            // 결과 보여주기
        }

        // 우승자 출력
    }

    public int getRandomNumber() {
        return random.nextInt(6) + 1;
    }
}

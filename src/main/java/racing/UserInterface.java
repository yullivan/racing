package racing;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void promptCarNames() {
        System.out.print("자동차 이름들을 입력하세요: ");
    }

    private static void promptDriveCount() {
        System.out.print("진행 횟수를 입력하세요: ");
    }

    // 기능(목적): 입력; 개발자에게 사용자가 입력한 이름들을 전달
    private static List<CarName> takeCarNamesInput() {
        List<String> names = List.of(scanner.nextLine().split(","));

        return names.stream()
                .map(name -> new CarName(name))
                .toList();
    }

    // 기능(목적): 재입력
    public static List<CarName> getCarNames() {
        List<CarName> names = List.of();
        while (names.isEmpty()) {
            try {
                promptCarNames();
                names = takeCarNamesInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return names;
    }


    private static DriveCount takeDriveCountInput() {
        return new DriveCount(Integer.parseInt(scanner.nextLine()));
    }

    public static DriveCount getDriveCount() {
        DriveCount driveCount = null;
        while (driveCount == null) {
            try {
                promptDriveCount();
                driveCount = takeDriveCountInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return driveCount;
    }

    public static void printResult(Cars cars) {
        System.out.println("==========================");
        for (Car car : cars.getCars()) {
            System.out.println(car.getName().name() + ": " + "-".repeat(car.getDistance()));
        }
    }

    public static void printWinners(Cars winners) {
        System.out.print("우승자: ");
        List<String> names = winners.getCars()
                .stream()
                .map(winner -> winner.getName().name())
                .toList();
        System.out.println(String.join(", ", names));
    }

    public static Cars getCars() {
        List<CarName> carNames = getCarNames();
        return new Cars(carNames.stream()
                .map(carName -> new Car(carName, 0))
                .toList());
    }
}

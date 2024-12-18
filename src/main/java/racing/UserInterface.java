package racing;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void promptCarNames() {
        System.out.print("자동차 이름들을 입력하세요: ");
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

    public static void printResult(List<Car> cars) {
        System.out.println("==========================");
        for (Car car : cars) {
            System.out.println(car.getName().name() + ": " + "-".repeat(car.getDistance()));
        }
    }

    public static void printWinners(List<Car> winners) {
        System.out.print("우승자: ");
        List<String> names = winners.stream()
                .map(winner -> winner.getName().name())
                .toList();
        System.out.println(String.join(", ", names));
    }
}

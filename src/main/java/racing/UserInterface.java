package racing;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void promptCarNames() {
        System.out.print("자동차 이름들을 입력하세요: ");
    }

    // 기능(목적): 입력; 개발자에게 사용자가 입력한 이름들을 전달
    private static List<String> takeNamesInput() {
        List<String> names = List.of(scanner.nextLine().split(","));
        validateNameLength(names); // 예외 발생 가능

        return names;
    }

    // 기능(목적): 재입력
    public static List<String> getNames() {
        List<String> names = List.of();
        while (names.isEmpty()) {
            try {
                promptCarNames();
                names = takeNamesInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return names;
    }

    private static void validateNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() > 10) {
                throw new IllegalArgumentException("[ERROR] 이름은 10자 이내");
            }
        }
    }
}

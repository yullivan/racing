package racing;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void promptCarNames() {
        System.out.print("자동차 이름들을 입력하세요: ");
    }

    public static List<String> getNames() {
        String s = scanner.nextLine();
        String[] split = s.split(",");

        return List.of(split);
    }
}

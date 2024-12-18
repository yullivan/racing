package racing;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void promptCarNames() {
        System.out.print("자동차 이름들을 입력하세요: ");
    }

    public static List<String> getNames() {
        List<String> names = List.of(scanner.nextLine().split(","));
        try {
            for (String name : names) {
                if (name.length() > 10) {
                    throw new IllegalArgumentException("[ERROR] 이름은 10자 이내");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            names = getNames();
        }

        return names;
    }
}

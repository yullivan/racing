package racing;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        UserInterface.promptCarNames();
        List<String> names = UserInterface.getNames();
        System.out.println("names = " + names);
    }

}

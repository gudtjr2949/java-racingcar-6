package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {

    public static List<String> readCarName() {
        String input = Console.readLine();
        return Arrays.asList(input.split(","));
    }

    public static int readRound() {
        String input = Console.readLine();
        isInteger(input);
        return Integer.parseInt(Console.readLine());
    }

    private static void isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
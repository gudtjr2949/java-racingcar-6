package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readCarName() {
        return Console.readLine();
    }

    public static int readRound() {
        return Integer.parseInt(Console.readLine());
    }
}
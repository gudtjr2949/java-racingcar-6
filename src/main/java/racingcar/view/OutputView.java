package racingcar.view;

import racingcar.model.Position;
import racingcar.util.Convertor;

import java.util.List;
import java.util.stream.Collectors;

import static racingcar.util.MessageConstant.*;

public class OutputView {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printCarPosition(String carName, int position) {
        System.out.println(carName + " : " + Convertor.intToLine(position));
    }

    public static void printFinalWinner(List<String> carNames) {
        String winnerNames = carNames.stream()
                .collect(Collectors.joining(RACE_WINNER_RESULT_DELIMITER));
        System.out.println(RACE_WINNER_FORMAT + winnerNames);
    }
}

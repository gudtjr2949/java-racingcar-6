package racingcar.view;

import racingcar.model.Position;
import racingcar.util.Convertor;

import java.util.Collections;
import java.util.List;

public class OutputView {

    public static void printCarNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printRoundInput() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarPosition(String carName, Position position) {
        System.out.println(carName + " : " + Convertor.intToLine(position.getIdx()));
    }

    public static void printFinalWinner(List<String> carNames) {
        System.out.print("최종 우승자 : ");
        // carNames 출력
        for (int i = 0 ; i < carNames.size() ; i++) {
            System.out.print(carNames.get(i));
            if (i != carNames.size()-1) System.out.print(", ");
        }
    }
}

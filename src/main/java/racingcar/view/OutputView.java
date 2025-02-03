package racingcar.view;

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

    public static void printCarPosition(String carName, int position) {
        String positionToLine = ""; // position -> - (직선)

        System.out.println(carName + " : " + positionToLine);
    }

    public static void printFinalWinner(List<String> carNames) {
        System.out.print("최종 우승자 : ");
        // carNames 출력
    }
}

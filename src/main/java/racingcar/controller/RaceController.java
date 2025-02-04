package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Round;
import racingcar.util.RaceConstant;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * TODO : 리팩토링 필요. 컨트롤러는 객체를 호출할 용도인데, 현재 코드에선 너무 많은 비즈니스 로직 역할까지 수행중임
 */
public class RaceController {

    private List<Car> cars = new ArrayList<>();
    private Round round;

    /**
     * TODO : 최적화 필요
     */
    public void start() {
        inputCar();
        inputRound();
        // 게임 진행
        OutputView.printResult();
        racing();
        OutputView.printFinalWinner(findWinner());
    }

    private List<String> findWinner() {
        Collections.sort(cars, (o1, o2) -> o2.getPosition().getIdx() - o1.getPosition().getIdx());
        List<String> winner = new ArrayList<>();
        int max = cars.get(0).getPosition().getIdx();

        for (Car car : cars) {
            if (car.getPosition().getIdx() == max) {
                winner.add(car.getName());
            } else {
                break;
            }
        }

        return winner;
    }

    /**
     * TODO : 2중 for 문 수정 필요
     */
    private void racing() {
        for (int i = 0 ; i < round.getTotal() ; i++) {
            for (Car car : cars) {
                car.moveForwardOrNot(getRandom());
            }
            // 결과 출력
            for (Car car : cars) {
                OutputView.printCarPosition(car.getName(), car.getPosition());
            }
            System.out.println();
        }
    }

    private static int getRandom() {
        return Randoms.pickNumberInRange(RaceConstant.RANDOM_START, RaceConstant.RANDOM_END);
    }

    private void inputRound() {
        OutputView.printRoundInput();
        round = new Round(InputView.readRound());
    }

    private void inputCar() {
        OutputView.printCarNameInput();
        StringTokenizer st = new StringTokenizer(InputView.readCarName(), ",");
        int size = st.countTokens();
        for (int i = 0 ; i < size ; i++) cars.add(new Car(st.nextToken()));
    }
}
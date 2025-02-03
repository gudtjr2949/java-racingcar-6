package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Round;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RaceController {

    private List<Car> cars = new ArrayList<>();
    private Round round;

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

    private void racing() {
        for (int i = 0 ; i < round.getTotal() ; i++) {
            for (Car car : cars) {
                car.moveForwardOrNot();
            }
            // 결과 출력
            for (Car car : cars) {
                OutputView.printCarPosition(car.getName(), car.getPosition());
            }
            System.out.println();
        }
    }

    private void inputRound() {
        OutputView.printRoundInput();
        round = new Round(InputView.readRound());
    }

    private void inputCar() {
        OutputView.printCarNameInput();
        StringTokenizer st = new StringTokenizer(InputView.readCarName(), ",");
        int size = st.countTokens();
        for (int i = 0 ; i < size ; i++) cars.add(new Car(st.nextToken(), 0));
    }
}

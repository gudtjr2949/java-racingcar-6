package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarName;
import racingcar.model.Position;
import racingcar.model.Round;
import racingcar.service.RaceService;

import racingcar.util.MessageConstant;
import racingcar.util.RaceConstant;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

import static racingcar.util.MessageConstant.*;
import static racingcar.util.RaceConstant.*;


public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void start() {
        List<Car> carList = inputCar();
        Round round = inputRound();

        // 게임 진행
        OutputView.printMessage(RACE_RESULT);
        raceService.racing(carList, round);
        raceOver(carList);
    }

    private List<Car> inputCar() {
        OutputView.printMessage(INPUT_CAR_NAME);
        return createCars(InputView.readCarName());
    }

    private Round inputRound() {
        OutputView.printMessage(INPUT_TOTAL_ROUND);
        return new Round(InputView.readRound());
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(CarName::new) // carNames의 문자열을 CarName 객체로 으로 변환
                .map(carName -> new Car(carName, new Position(START_POSITION)))
                .collect(Collectors.toList());
    }

    private void raceOver(List<Car> carList) {
        OutputView.printFinalWinner(raceService.findWinner(carList));
    }
}
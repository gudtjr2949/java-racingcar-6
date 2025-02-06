package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarName;
import racingcar.model.Round;
import racingcar.service.RaceService;

import racingcar.util.MessageConstant;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void start() {
        List<Car> carList = inputCar();
        Round round = inputRound();

        // 게임 진행
        OutputView.printMessage(MessageConstant.RACE_RESULT);
        raceService.racing(carList, round);
        raceOver(carList);
    }

    private List<Car> inputCar() {
        OutputView.printMessage(MessageConstant.INPUT_CAR_NAME);
        return createCars(inputCarNames());
    }

    private List<String> inputCarNames() {
        return Arrays.asList(InputView.readCarName().split(","));
    }

    private Round inputRound() {
        OutputView.printMessage(MessageConstant.INPUT_TOTAL_ROUND);
        return new Round(InputView.readRound());
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(CarName::new)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private void raceOver(List<Car> carList) {
        OutputView.printFinalWinner(raceService.findWinner(carList));
    }
}
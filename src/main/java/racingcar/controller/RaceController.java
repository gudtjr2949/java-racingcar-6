package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Round;
import racingcar.service.RaceService;
import racingcar.service.RaceServiceImpl;
import racingcar.util.RaceConstant;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void start() {
        OutputView.printCarNameInput();
        Cars cars = inputCar();

        OutputView.printRoundInput();
        Round round = inputRound();

        RaceService raceService = new RaceServiceImpl();

        // 게임 진행
        OutputView.printResult();
        raceService.racing(cars, round);
        OutputView.printFinalWinner(raceService.findWinner(cars));
    }

    private Round inputRound() {
        return new Round(InputView.readRound());
    }

    private Cars inputCar() {
        StringTokenizer st = new StringTokenizer(InputView.readCarName(), ",");
        int size = st.countTokens();
        List<Car> list = new ArrayList<>();
        for (int i = 0 ; i < size ; i++) list.add(new Car(st.nextToken()));
        return new Cars(list);
    }
}
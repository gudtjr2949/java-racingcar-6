package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Round;

import java.util.List;

public interface RaceService {
    void racing(Cars cars, Round round);
    List<String> findWinner(Cars cars);
}

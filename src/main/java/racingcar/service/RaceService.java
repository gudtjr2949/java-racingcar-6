package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Round;

import java.util.List;

public interface RaceService {
    void racing(List<Car> carList, Round round);
    List<String> findWinner(List<Car> carList);
}
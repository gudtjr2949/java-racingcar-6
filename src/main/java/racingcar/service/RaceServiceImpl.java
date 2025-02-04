package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Round;
import racingcar.util.RaceConstant;
import racingcar.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class RaceServiceImpl implements RaceService {

    @Override
    public void racing(Cars cars, Round round) {
        for (int i = 0 ; i < round.getTotal() ; i++) {
            cars.getCarList().forEach(car -> car.moveForwardOrNot(getRandom()));
            cars.getCarList().forEach(car -> OutputView.printCarPosition(car.getName(), car.getPosition()));
            System.out.println();
        }
    }

    private static int getRandom() {
        return Randoms.pickNumberInRange(RaceConstant.RANDOM_START, RaceConstant.RANDOM_END);
    }

    @Override
    public List<String> findWinner(Cars cars) {
        int max = cars.getCarList().stream()
                .mapToInt(car -> car.getPosition().getIdx())
                .max()
                .orElse(0);

        return cars.getCarList().stream()
                .filter(car -> car.getPosition().getIdx() == max)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}

package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Round;
import racingcar.util.RaceConstant;
import racingcar.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class RaceServiceImpl implements RaceService {

    @Override
    public void racing(List<Car> carList, Round round) {
        int curRound = 0;

        while (round.hasMoreRounds(curRound++)) {
            carList.forEach(car -> car.moveForwardOrNot(getRandom()));
            carList.forEach(car -> OutputView.printCarPosition(car.getCarName(), car.getPosition()));
            OutputView.printMessage("\n");
        }
    }

    private static int getRandom() {
        return Randoms.pickNumberInRange(RaceConstant.RANDOM_START, RaceConstant.RANDOM_END);
    }

    @Override
    public List<String> findWinner(List<Car> carList) {
        int maxPosition = getMaxPosition(carList);

        return carList.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    /**
     * 가장 멀리간 자동차 위치
     */
    private static int getMaxPosition(List<Car> carList) {
        return carList.stream()
                .mapToInt(car -> car.getPosition())
                .max()
                .orElse(0);
    }
}

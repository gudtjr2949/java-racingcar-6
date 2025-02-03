package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.RaceConstant;

public class Car {
    private String name;
    private Position position;

    public Car(String name, Position position) {
        // validate Name
        this.name = name;
        this.position = position;
    }

    public void moveForwardOrNot() {
        // 난수 생성
        int random = Randoms.pickNumberInRange(RaceConstant.RANDOM_START, RaceConstant.RANDOM_END);
        if (random >= RaceConstant.FORWARD) position.moveForward();
    }
}

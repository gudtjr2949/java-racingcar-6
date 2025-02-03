package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.RaceConstant;

public class Car {
    private String name;
    private Position position;

    public Car(String name, int start) {
        // validate Name
        this.name = name;
        this.position = new Position(start);
    }

    public void moveForwardOrNot() {
        // 난수 생성
        int random = Randoms.pickNumberInRange(RaceConstant.RANDOM_START, RaceConstant.RANDOM_END);
        if (random >= RaceConstant.FORWARD) position.moveForward();
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}

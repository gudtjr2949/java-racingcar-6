package racingcar.model;

import racingcar.util.RaceConstant;
import racingcar.util.Validator;

public class Car {
    private String name;
    private Position position;

    public Car(String name) {
        // validate Name
        validateCarName(name);
        this.name = name;
        this.position = new Position(RaceConstant.START_POSITION);
    }

    private static void validateCarName(String name) {
        Validator.isTooShortThenStandard(name);
        Validator.isTooLongThenStandard(name);
    }

    public void moveForwardOrNot(int random) {
        // 난수 생성
        if (random >= RaceConstant.FORWARD_STANDARD) position.moveForward();
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}

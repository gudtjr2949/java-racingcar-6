package racingcar.model;

import racingcar.util.RaceConstant;

import static racingcar.util.RaceConstant.*;

public class Car {
    private CarName carName;
    private Position position;

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public void moveForwardOrNot(int random) {
        if (random >= FORWARD_STANDARD) position.moveForward();
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getPosition() {
        return position.getIdx();
    }
}

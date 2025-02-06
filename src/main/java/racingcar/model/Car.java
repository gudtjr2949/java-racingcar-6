package racingcar.model;

import racingcar.util.RaceConstant;

public class Car {
    private CarName carName;
    private Position position;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position(RaceConstant.START_POSITION);
    }

    public void moveForwardOrNot(int random) {
        // 난수 생성
        if (random >= RaceConstant.FORWARD_STANDARD) position.moveForward();
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getPosition() {
        return position.getIdx();
    }
}

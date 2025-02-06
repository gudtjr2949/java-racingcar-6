package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.util.RaceConstant;

import static org.assertj.core.api.Assertions.*;
import static racingcar.util.RaceConstant.*;

class PositionTest {

    @Test
    void 랜덤값이_MOVE_FORWARD_보다_작다면_Position_idx가_변하지_않는다() {
        // given
        int random = 3;
        int firstPosition = 0;
        String carName = "tom";
        Car car = new Car(new CarName(carName), new Position(firstPosition));

        // when
        car.moveForwardOrNot(random);

        // then
        assertThat(car.getPosition()).isEqualTo(firstPosition);
    }

    @Test
    void 랜덤값이_MOVE_FORWARD_이상이라면_Position_idx가_1_증가한다() {
        // given
        int random = 4;
        int firstPosition = 0;
        String carName = "tom";
        Car car = new Car(new CarName(carName), new Position(firstPosition));

        // when
        car.moveForwardOrNot(random);

        // then
        assertThat(car.getPosition()).isGreaterThan(firstPosition);
    }
}
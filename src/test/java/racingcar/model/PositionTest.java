package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PositionTest {

    @Test
    void 랜덤값이_MOVE_FORWARD_보다_작다면_Position_idx가_변하지_않는다() {
        // given
        int random = 3;
        int firstPosition = 0;
        Car car = new Car("tom");

        // when
        car.moveForwardOrNot(random);

        // then
        assertThat(car.getPosition().getIdx()).isEqualTo(firstPosition);
    }

    @Test
    void 랜덤값이_MOVE_FORWARD_이상이라면_Position_idx가_1_증가한다() {
        // given
        int random = 4;
        int firstPosition = 0;
        Car car = new Car("tom");

        // when
        car.moveForwardOrNot(random);

        // then
        assertThat(car.getPosition().getIdx()).isGreaterThan(firstPosition);
    }
}
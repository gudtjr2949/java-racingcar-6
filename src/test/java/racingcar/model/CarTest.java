package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.util.RaceConstant;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_객체가_생성될_경우_시작위치는_START_POSITION이다() {
        // given
        String carName = "tom";

        // when
        Car car = new Car(new CarName(carName));

        // then
        assertThat(car.getPosition()).isEqualTo(RaceConstant.START_POSITION);
    }

    @Test
    void 생성된_랜덤값이_FORWARD_STANDARD_초과일_경우_전진한다() {
        // given
        Car car1 = new Car(new CarName("tom"));
        Car car2 = new Car(new CarName("jack"));
        int move = 5;
        int notMove = 1;

        // when
        car1.moveForwardOrNot(move);
        car2.moveForwardOrNot(notMove);

        // then
        assertThat(car1.getPosition()).isEqualTo(1);
        assertThat(car2.getPosition()).isEqualTo(0);
    }

}
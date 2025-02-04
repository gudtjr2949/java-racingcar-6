package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.util.RaceConstant;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_이름_길이가_6이상이거나_0이하인_경우_예외가_발생한다() {
        // given
        String shortName = "";
        String longName = "abcdef";

        // when & then
        assertThatThrownBy(() -> new Car(shortName)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Car(longName)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_객체가_생성될_경우_시작위치는_START_POSITION이다() {
        // given
        String name = "tom";

        // when
        Car car = new Car(name);

        // then
        assertThat(car.getPosition().getIdx()).isEqualTo(RaceConstant.START_POSITION);
    }

    @Test
    void 생성된_랜덤값이_FORWARD_STANDARD_초과일_경우_전진한다() {
        // given
        Car car1 = new Car("tom");
        Car car2 = new Car("jack");
        int move = 5;
        int notMove = 1;

        // when
        car1.moveForwardOrNot(move);
        car2.moveForwardOrNot(notMove);

        // then
        assertThat(car1.getPosition().getIdx()).isEqualTo(1);
        assertThat(car2.getPosition().getIdx()).isEqualTo(0);
    }

}
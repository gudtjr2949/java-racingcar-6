package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RoundTest {

    @Test
    void 입력된_경기_횟수가_0이하라면_예외가_발생한다() {
        // given
        int zero = 0;
        int negative = -1;

        // when & then
        assertThatThrownBy(() -> new Round(zero)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Round(negative)).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 경기_횟수_객체가_정상적으로_생성된다() {
        // given
        int normal = 10;

        // when
        Round round = new Round(normal);

        // then
        assertThat(round.getTotal()).isEqualTo(normal);
    }
}
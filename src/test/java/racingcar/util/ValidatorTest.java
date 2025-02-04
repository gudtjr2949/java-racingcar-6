package racingcar.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidatorTest {

    @Test
    void 문자열이_기준_길이보다_길_경우_예외가_발생한다() {
        // given
        String longStr = "abcdef";

        // when & then
        assertThatThrownBy(() -> Validator.isTooLongThenStandard(longStr)).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 정수가_0이하일_경우_예외가_발생한다() {
        // given
        int zero = 0;
        int negative = -1;

        // when & then
        assertThatThrownBy(() -> Validator.isMoreThenZero(zero)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Validator.isMoreThenZero(negative)).isInstanceOf(IllegalArgumentException.class);
    }

}
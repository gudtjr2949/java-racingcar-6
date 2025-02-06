package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    void 자동차_이름_길이가_6이상이거나_0인_경우_예외가_발생한다() {
        // given
        String shortName = "";
        String longName = "abcdef";

        // when & then
        assertThatThrownBy(() -> new CarName(shortName)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new CarName(longName)).isInstanceOf(IllegalArgumentException.class);
    }
}
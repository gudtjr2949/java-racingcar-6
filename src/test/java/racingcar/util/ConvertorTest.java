package racingcar.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConvertorTest {

    @Test
    void 입력된_정수만큼_미리_설정된_특수문자로_변환한다() {
        // given
        int one = 0;
        int five = 5;
        int ten = 10;

        // when
        String oneLine = Convertor.intToLine(one);
        String fiveLine = Convertor.intToLine(five);
        String tenLine = Convertor.intToLine(ten);

        // then
        assertThat(oneLine).hasSize(one);
        assertThat(fiveLine).hasSize(five);
        assertThat(tenLine).hasSize(ten);
    }
}
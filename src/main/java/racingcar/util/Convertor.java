package racingcar.util;

import static racingcar.util.RaceConstant.*;

public class Convertor {
    private Convertor(){}

    public static String intToLine(int num) {
        return LINE.repeat(num);
    }
}

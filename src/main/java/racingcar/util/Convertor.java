package racingcar.util;

public class Convertor {
    private Convertor(){}

    /**
     * TODO : 최적화 필요
     *
     */
    public static String intToLine(int num) {
        String result = "";
        for (int i = 0 ; i < num ; i++) result += RaceConstant.LINE;
        return result;
    }
}

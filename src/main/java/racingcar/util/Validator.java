package racingcar.util;

public class Validator {

    private Validator() {}

    public static void isTooLongThenStandard(String s) {
        if (s.length() > RaceConstant.NAME_MAXIMUM_LENGTH) throw new IllegalArgumentException();
    }

    public static void isTooShortThenStandard(String s) {
        if (s.length() < RaceConstant.NAME_MINIMUM_LENGTH) throw new IllegalArgumentException();
    }

    public static void isMoreThenZero(int num) {
        if (num <= 0) throw new IllegalArgumentException();
    }
}
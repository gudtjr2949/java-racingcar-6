package racingcar.util;

public class Validator {

    private Validator() {}

    public static void isTooLongThenStandard(String s) {
        if (s.length() > RaceConstant.NAME_MAXIMUM_LENGTH) throw new IllegalArgumentException();
    }

    public static void isTooShortThenStandard(String s) {
        if (s.length() < RaceConstant.NAME_MINIMUM_LENGTH) throw new IllegalArgumentException();
    }

    // 입력된 자동차 이름 중, 같은 이름이 2개 이상이면 안됨
    public static void isDuplicatedString(String name1, String name2) {

    }


    public static void isMoreThenZero(int num) {
        if (num <= 0) throw new IllegalArgumentException();
    }
}

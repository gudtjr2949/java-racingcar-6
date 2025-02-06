package racingcar.model;

import racingcar.util.RaceConstant;

public class CarName {
    public static final int NAME_MAXIMUM_LENGTH = 5;
    public static final int NAME_MINIMUM_LENGTH = 1;

    private final String name;

    public CarName(String name) {
        // 이름 검증
        validateCarName(name);
        this.name = name;
    }

    private static void validateCarName(String name) {
        isTooShortThenStandard(name);
        isTooLongThenStandard(name);
    }

    private static void isTooLongThenStandard(String s) {
        if (s.length() > NAME_MAXIMUM_LENGTH) throw new IllegalArgumentException();
    }

    private static void isTooShortThenStandard(String s) {
        if (s.length() < NAME_MINIMUM_LENGTH) throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
}

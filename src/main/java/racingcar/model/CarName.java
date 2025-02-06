package racingcar.model;

import static racingcar.util.Validator.*;

public class CarName {
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

    public String getName() {
        return name;
    }
}

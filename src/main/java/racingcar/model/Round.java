package racingcar.model;

import racingcar.util.Validator;

/**
 * 시도 횟수
 */
public class Round {
    private final int total; // 총 라운드는 할당된 이후, 변하면 안됨

    public Round(int total) {
        Validator.isMoreThenZero(total);
        this.total = total;
    }

    @Override
    public String toString() {
        return "Round{" +
                "total=" + total +
                '}';
    }

    public int getTotal() {
        return total;
    }
}

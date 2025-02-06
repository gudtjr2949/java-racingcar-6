package racingcar.model;

import racingcar.util.Validator;

import static racingcar.util.Validator.*;

/**
 * 시도 횟수
 */
public class Round {
    private final int total;

    public Round(int total) {
        validateTotal(total);
        this.total = total;
    }

    private static void validateTotal(int total) {
        isMoreThenZero(total);
    }

    public boolean hasMoreRounds(int curRound) {
        return total > curRound;
    }

    public int getTotal() {
        return total;
    }
}

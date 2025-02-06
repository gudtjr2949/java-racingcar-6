package racingcar.model;

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

    private static void isMoreThenZero(int num) {
        if (num <= 0) throw new IllegalArgumentException();
    }

    public boolean hasMoreRounds(int curRound) {
        return total > curRound;
    }

    public int getTotal() {
        return total;
    }
}

package racingcar.model;

public class Position {
    private int idx;

    public Position(int idx) {
        validateIdx(idx);
        this.idx = idx;
    }

    private static void validateIdx(int idx) {
        isMoreThenZero(idx);
    }

    public void moveForward() {
        this.idx++;
    }

    private static void isMoreThenZero(int idx) {
        if (idx < 0) throw new IllegalArgumentException();
    }

    public int getIdx() {
        return idx;
    }
}

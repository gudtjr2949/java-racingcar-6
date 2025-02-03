package racingcar.model;

public class Position {

    private int idx;

    public Position(int idx) {
        this.idx = idx;
    }

    public void moveForward() {
        this.idx++;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return "Position{" +
                "idx=" + idx +
                '}';
    }
}

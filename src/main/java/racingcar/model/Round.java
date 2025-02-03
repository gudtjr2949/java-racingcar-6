package racingcar.model;

/**
 * 시도 횟수
 */
public class Round {
    private final int total; // 총 라운드는 할당된 이후, 변하면 안됨

    public Round(int total) {
        this.total = total;
    }
}

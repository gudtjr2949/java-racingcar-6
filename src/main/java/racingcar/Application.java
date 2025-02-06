package racingcar;

import racingcar.controller.RaceController;
import racingcar.service.RaceServiceImpl;

public class Application {
    public static void main(String[] args) {
        RaceController controller = new RaceController(new RaceServiceImpl());
        controller.start();
    }
}

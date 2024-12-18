package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void name() {
        Car car = new Car("", 0);

        boolean result = car.drive(3);

        assertThat(result).isTrue();
        assertThat(car.getDistance()).isEqualTo(1);
    }
}

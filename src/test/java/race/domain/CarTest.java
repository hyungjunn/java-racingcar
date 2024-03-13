package race.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    void init() {
        car = new Car(1, "임형준");
    }

    @ParameterizedTest
    @CsvSource(value = {"4:4", "3:1"}, delimiter = ':')
    void go_three_times(int randomNumber, int expected) {
        car.go(randomNumber);
        car.go(randomNumber);
        car.go(randomNumber);
        assertThat(car.getPosition()).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"4:3", "3:1"}, delimiter = ':')
    void go_twice(int randomNumber, int expected) {
        car.go(randomNumber);
        car.go(randomNumber);
        assertThat(car.getPosition()).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"4:2", "3:1"}, delimiter = ':')
    void go(int randomNumber, int expected) {
        car.go(randomNumber);
        assertThat(car.getPosition()).isEqualTo(expected);
    }

}

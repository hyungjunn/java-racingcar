package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static calculator.StringAddCalculator.calculate;
import static org.assertj.core.api.Assertions.*;

public class StringAddCalculatorTest {

    @Test
    void negativeTes1t() {
        assertThatThrownBy(() -> {
            calculate("-1,3,2");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(String.format("(%s)엔 음수가 포함되어 있습니다. 음수는 허용되지 않습니다.", "-1,3,2"));
    }

    @Test
    void customTest() {
        int number = calculate("//;\n1;2;3");
        assertThat(number).isEqualTo(6);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2=3", "1:2=3", "1:2,3=6", "1:2,3:9=15"}, delimiter = '=')
    void colonAndCommaTest(String input, int expected) {
        int number = calculate(input);
        assertThat(number).isEqualTo(expected);
    }

    @Test
    void oneNumberTest2() {
        int number = calculate("111");
        assertThat(number).isEqualTo(111);
    }

    @Test
    void oneNumberTest() {
        int number = calculate("1");
        assertThat(number).isEqualTo(1);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", ""})
    void isNullAndBlankTest(String input) {
        int number = calculate(input);
        assertThat(number).isEqualTo(0);
    }

}
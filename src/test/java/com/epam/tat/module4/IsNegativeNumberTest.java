package com.epam.tat.module4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Calculator checks if a number is negative")
final class IsNegativeNumberTest extends CalculatorTest {

    @ParameterizedTest(name = "{0} is not a negative number")
    @ValueSource(longs = {0, 1, 8, 4_209, Short.MAX_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE})
    @DisplayName("check for a number that is not a negative number")
    void checkLongNotNegativeNumber(long number) {
        var isNegative = calculator.isNegative(number);
        Assertions.assertFalse(isNegative, () -> "the number %d is not a negative number".formatted(number));
    }

    @ParameterizedTest(name = "{0} is a negative number")
    @ValueSource(longs = {-1, -5, -327, Short.MIN_VALUE, Integer.MIN_VALUE, Long.MIN_VALUE})
    @DisplayName("check for a number that is a negative number")
    void checkLongNegativeNumber(long number) {
        var isPositive = calculator.isPositive(number);
        Assertions.assertFalse(isPositive, () -> "the number %d is a negative number".formatted(number));
    }
}

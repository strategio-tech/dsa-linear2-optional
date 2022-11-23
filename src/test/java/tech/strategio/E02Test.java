package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E02Test {
    @DisplayName("is valid parenthesis")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("streamTestCases")
    void streamTestCases(String values, boolean result) {
        E02 exercise = new E02();
        boolean val = exercise.isValidParen(values);
        assertEquals(result, val);
    }

    private static Stream<Arguments> streamTestCases() {
        return Stream.of(
                Arguments.arguments("()", true),
                Arguments.arguments("(", false),
                Arguments.arguments("(())", true),
                Arguments.arguments("([])", true),
                Arguments.arguments("([)]", false),
                Arguments.arguments("()[]{}", true),
                Arguments.arguments("(]", false));
    }
}

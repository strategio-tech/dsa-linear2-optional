package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E03Test {
    @DisplayName("is palindrome")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("streamTestCases")
    void streamTestCases(String values, boolean result) {
        E03 exercise = new E03();
        boolean val = exercise.isPalindrome(values);
        assertEquals(result, val);
    }

    private static Stream<Arguments> streamTestCases() {
        return Stream.of(
                Arguments.arguments("A man, a plan, a canal: Panama", true),
                Arguments.arguments("race a car", false),
                Arguments.arguments(" ", true),
                Arguments.arguments("aba", true),
                Arguments.arguments("a ba", true),
                Arguments.arguments("a bA", true),
                Arguments.arguments("ab", false));
    }
}

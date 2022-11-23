package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E04Test {
    @DisplayName("longest substring")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("streamTestCases")
    void streamTestCases(String values, int result) {
        E04 exercise = new E04();
        int val = exercise.lengthOfLongestSubstring(values);
        assertEquals(result, val);
    }

    private static Stream<Arguments> streamTestCases() {
        return Stream.of(
                Arguments.arguments("bbbbb", 1),
                Arguments.arguments("a", 1),
                Arguments.arguments("abc", 3),
                Arguments.arguments("abcb", 3),
                Arguments.arguments("abcabcbb", 3),
                Arguments.arguments("abcdeabcdefc", 6),
                Arguments.arguments("abccdeaabbcddef", 4),
                Arguments.arguments("abacacacaaabacaaaeaaafa", 3),
                Arguments.arguments("abcdabcef", 6),
                Arguments.arguments("pwwkew", 3));
    }
}

package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E01Test {
    @DisplayName("Contains Duplicate")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("streamTestCases")
    void streamTestCases(String values, String result) {
        E01 exercise = new E01();
        String val = exercise.reverseVowels(values);
        assertEquals(result, val);
    }

    private static Stream<Arguments> streamTestCases() {
        return Stream.of(
                Arguments.arguments("hello", "holle"),
                Arguments.arguments("a", "a"),
                Arguments.arguments("b", "b"),
                Arguments.arguments("ab", "ab"),
                Arguments.arguments("io", "oi"),
                Arguments.arguments("leetcode", "leotcede"),
                Arguments.arguments("seanace", "seanace"),
                Arguments.arguments("repeater", "repaeter"),
                Arguments.arguments("Ee", "eE"),
                Arguments.arguments("Ales", "elAs"),
                Arguments.arguments("strategio", "strotigea"));
    }
}

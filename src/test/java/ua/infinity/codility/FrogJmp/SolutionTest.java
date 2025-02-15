package ua.infinity.codility.FrogJmp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alex Oliinyk
 */
class SolutionTest {

    private final Solution solution = new Solution();

    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(10, 85, 30, 3)
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int x, int y, int d, int expected) {
        assertEquals(expected, solution.solution(x, y, d));
    }
}
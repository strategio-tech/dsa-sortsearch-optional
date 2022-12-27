package tech.strategio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class TestE02 {
    @DisplayName("checkIfArrayIsSorted")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
    void argumentStream(int[] values, int[] result) {
        int[] val = E02.insertionSort(values);
        assertArrayEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(new int[] { 141, 1, 17, -7, -17, -27 },
                        new int[] { -27, -17, -7, 1, 17, 141 }),
                Arguments.arguments(new int[] { 55, 7, 8 }, new int[] { 7, 8, 55 }),
                Arguments.arguments(new int[] { 55, 43, 11, 0, 3, -3, 10 }, new int[] { -3, 0, 3, 10, 11, 43, 55 }),
                Arguments.arguments(new int[] { 7, 7, 7, 7, 7 }, new int[] { 7, 7, 7, 7, 7 }),
                Arguments.arguments(new int[] { -1, -2, -3, -7, -17, -27 },
                        new int[] { -27, -17, -7, -3, -2, -1 }));
    }
}

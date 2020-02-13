package boot.jupiter.junit5.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;

@SpringBootTest
public class AssertionsTests {

    @Test
    void assertTrueTest() {
        Assertions.assertTrue(Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum() == 15 , () -> "1+2+3+4+5 = 15");
    }

    // Be able to pinpoint where failed
    @Test
    void assertAllTest() {
        // given
        int[] array = {1, 2, 3, 4, 5};

        //then
        Assertions.assertAll("array",
                () -> Assertions.assertEquals(array[0], 1),
                () -> Assertions.assertEquals(array[3], 4),
                () -> Assertions.assertEquals(array[2], 3));
    }
}

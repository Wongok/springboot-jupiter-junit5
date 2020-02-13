package boot.jupiter.junit5.test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AssumptionsTests {

    // Assumptions.xxx throws TestAbortedException

    @Test
    void trueAssumption() {
        Assumptions.assumeTrue(1 + 3 > 0);
        assertEquals(2 * 3,  6);
    }

    @Test
    void falseAssumption() {
        Assumptions.assumeFalse(2 < 1);
        assertEquals(2 * 3, 6);
    }

    @Test
    void assumptionThat() {
        // given
        String str = "Test";

        // then
        Assumptions.assumingThat(str.equals("Test"),
                () -> assertEquals(2*3, 6));
    }
}

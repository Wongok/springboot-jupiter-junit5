package boot.jupiter.junit5.test;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ParameterResolverExample {

    @Test
    @DisplayName("TestInfo Injection")
    void testinfo(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @RepeatedTest(10)
    @DisplayName("RepetitionInfo Injection")
    void testinfo(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
    }
}

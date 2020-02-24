package boot.jupiter.junit5.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepeatedTests {

    @RepeatedTest(10)
    @DisplayName("RepeatedTests")
    void repeatedTest() {
        System.out.println("Repeated Test");
    }

    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition} of {totalRepetitions}")
    @DisplayName("RepeatedTests")
    void repeatedTest2() {
        System.out.println("Repeated Test");
    }
}

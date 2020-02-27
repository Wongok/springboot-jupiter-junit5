package boot.jupiter.junit5.defaultmethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public interface DefaultTestEachInterface {

    @BeforeEach
    default void beforeEach(TestInfo testInfo) {
        System.out.println("Test execute : " + testInfo.getDisplayName());
    }

    @AfterEach
    default void afterEach(TestInfo testInfo) {
        System.out.println("Test execute : " + testInfo.getDisplayName());
    }
}

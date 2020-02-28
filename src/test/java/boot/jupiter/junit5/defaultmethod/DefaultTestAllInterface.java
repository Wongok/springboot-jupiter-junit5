package boot.jupiter.junit5.defaultmethod;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface DefaultTestAllInterface {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    default void afterAll() {
        System.out.println("After All");
    }
}

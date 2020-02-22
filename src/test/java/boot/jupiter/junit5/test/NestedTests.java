package boot.jupiter.junit5.test;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NestedTests {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Parent beforeAll");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("Parent afterAll");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Parent beforeEach");
    }
    @AfterEach
    void afterEach() {
        System.out.println("Parent afterEach");
    }
    @Test
    void test() {
        System.out.println("Parent test");
    }

    @Nested
    class Child {
        @BeforeEach
        void beforeEach() {
            System.out.println("Child beforeEach");
        }
        @AfterEach
        void afterEach() {
            System.out.println("Child afterEach");
        }
        @Test
        void test() {
            System.out.println("Child Test");
        }
    }
}

package boot.jupiter.junit5.test;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JUnit5Tests {

    private static final Logger logger = LoggerFactory.getLogger(JUnit5Tests.class);

    // A method with an annotation runs before all test methods of the current class.
    // static
    // == @BeforeClass (junit4)
    @BeforeAll
    static void setup() {
        logger.info("@BeforeAll - executes once before all test methods in this class");
    }

    // A method with annotation runs before each test method.
    // == @Before (junit4)
    @BeforeEach
    void init() {
        logger.info("@BeforeEach - executes before each test method in this class");
    }

    // A method with an annotation runs after all test methods of the current class.
    // static
    // == @AfterClass (junit4)
    @AfterAll
    static void cleanUp() {
        logger.info("@AfterAll - executed after all test methods.");
    }

    // A method with annotation runs after each test method.
    // == @After (junit4)
    @AfterEach
    void cleanUpEach() {
        logger.info("@AfterEach - executed after each test methods.");
    }

    @Test
    @DisplayName("Check Run Order of the Before")   // Defining the name of a class or method
    void test() {
        logger.info("BeforeAll -> BeforeEach -> AfterEach -> AfterAll");
    }

    @Test
    @Disabled("Not implemented yet")    // == @Ignore (junit4)
    void testDisabled() {
    }
}

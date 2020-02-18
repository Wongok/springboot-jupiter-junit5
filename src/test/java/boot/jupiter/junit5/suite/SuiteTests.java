package boot.jupiter.junit5.suite;

//Test classes and suites annotated with @RunWith(JUnitPlatform.class) cannot be executed directly
// on the JUnit Platform (or as a "JUnit 5" test as documented in some IDEs).
// Such classes and suites can only be executed using JUnit 4 infrastructure.
//@RunWith(JUnitPlatform.class)
//@SelectPackage({"boot.jupiter.junit5.suite.packageA", "boot.jupiter.junit5.suite.packageB"})
//@SelectClasses
public class SuiteTests {
}
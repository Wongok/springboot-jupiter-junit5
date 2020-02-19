package boot.jupiter.junit5.test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DynamicTests {

    @TestFactory
    Iterable<DynamicTest> dynamicTestsWithIterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsWithIterator() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))))
                .iterator();
    }
}

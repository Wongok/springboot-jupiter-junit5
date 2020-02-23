package boot.jupiter.junit5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.condition.OS.*;
import static org.junit.jupiter.api.condition.JRE.*;
@SpringBootTest
public class ConditionalExecutionTests {

    // OS
    @Test
    @EnabledOnOs(MAC)
    void Mac_OS() {
        System.out.println("Mac OS");
    }

    @Test
    @EnabledOnOs({LINUX, MAC})
    void Linux_Mac_OS() {
        System.out.println("Linux or Mac");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void not_Windows_OS() {
        System.out.println("not Windows");
    }

    // Jre
    @Test
    @EnabledOnJre(JAVA_8)
    void java8() {
        System.out.println("java8");
    }

    @Test
    @EnabledOnJre({JAVA_9, JAVA_10})
    void java9or10() {
        System.out.println("java 9 or 10");
    }

    @Test
    @DisabledOnJre(JAVA_11)
    void not_java11() {
        System.out.println("not Java 11");
    }
}

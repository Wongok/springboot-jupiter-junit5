package boot.jupiter.junit5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.condition.OS.*;

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
}

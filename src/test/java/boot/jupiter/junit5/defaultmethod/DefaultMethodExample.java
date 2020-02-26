package boot.jupiter.junit5.defaultmethod;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultMethodExample {

    @Test
    void test() {
        System.out.println("Test");
    }
}

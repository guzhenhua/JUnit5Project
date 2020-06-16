import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestJUnit5 {
    @Test
    void test() {
        assertAll("test",
                () -> assertEquals(1, 2),
                () -> assertEquals(1,1),
                () -> assertEquals(1,3)
        );
    }
}

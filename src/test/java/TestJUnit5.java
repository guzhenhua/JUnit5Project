import javabean.User;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestJUnit5 {
    @Test
    void test() {
        assertAll("test",
                () -> assertEquals(1, 1),
                () -> assertEquals(1,1),
                () -> assertEquals(1,1),
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        assertEquals(1,2);
                    }
                }
        );
    }
}

package qa.guru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(3 < 2);
    }
    public class FirstTest {
        @Test
        void SecondTest() {
            Assertions.assertFalse(3 < 1);
        }


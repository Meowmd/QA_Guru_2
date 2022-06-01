package qa.guru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }
    public class FirstTest {
        @Test
        void SecondTest() {
            Assertions.assertTrue(3 > 2);
        }


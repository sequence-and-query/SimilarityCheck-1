import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    private SimilarityChecker similarityChecker;

    @BeforeEach
    public void setUp() {
        similarityChecker = new SimilarityChecker();
    }

    @Test
    public void stringLengthChecker() {
        String str1 = "Hello";
        String str2 = "World";

        int expected = 60;
        int actual = similarityChecker.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }

    @Test
    public void stringLengthCheckerWithZero() {
        String str1 = "Hello";
        String str2 = "HelloMyNameIs";

        int expected = 0;
        int actual = similarityChecker.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }

    @Test
    public void stringLengthCheckerWithNonzero() {
        String str1 = "Hello";
        String str2 = "World!";

        int expected = 48;
        int actual = similarityChecker.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCalculatorTest {
    @Test
    public void stringLengthChecker() {
        String str1 = "Hello";
        String str2 = "World";
        SimilarityCalculator similarityCalculator = new SimilarityCalculator();

        int expected = 60;
        int actual = similarityCalculator.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }

    @Test
    public void stringLengthCheckerWithZero() {
        String str1 = "Hello";
        String str2 = "HelloMyNameIs";
        SimilarityCalculator similarityCalculator = new SimilarityCalculator();

        int expected = 0;
        int actual = similarityCalculator.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }

    @Test
    public void stringLengthCheckerWithNonzero() {
        String str1 = "Hello";
        String str2 = "World!";

        SimilarityCalculator similarityCalculator = new SimilarityCalculator();

        int expected = 48;
        int actual = similarityCalculator.calculateLengthScore(str1, str2);

        assertEquals(expected, actual);
    }
}

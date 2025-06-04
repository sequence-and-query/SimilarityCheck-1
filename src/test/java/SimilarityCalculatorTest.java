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
}
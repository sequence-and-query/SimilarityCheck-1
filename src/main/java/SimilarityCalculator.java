public class SimilarityCalculator {
    public int calculateLengthScore(String str1, String str2) {
        if(str1.length() == str2.length()) {
            return 60;
        }
        return 0;
    }

    private int getLongLength(String str1, String str2) {
        return str1.length() > str2.length() ? str1.length() : str2.length();
    }

    private int getShortLength(String str1, String str2) {
        return str1.length() > str2.length() ? str2.length() : str1.length();
    }
}

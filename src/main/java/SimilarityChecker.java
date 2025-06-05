public class SimilarityChecker {
    public static final int MAX_LENGTH_SCORE = 60;
    public static final int ZERO_SCORE = 0;

    public int calculateLengthScore(String str1, String str2) {
        if(str1.length() == str2.length()) {
            return MAX_LENGTH_SCORE;
        }

        if(isOneStringLengthDoubleThanOther(str1, str2)) {
            return ZERO_SCORE;
        }

        int gap = getDiffOfLength(str1, str2);
        int shortLength = getShortLength(str1, str2);

        return (int) ((1 - (double)gap / shortLength) * MAX_LENGTH_SCORE);
    }

    private boolean isOneStringLengthDoubleThanOther(String str1, String str2) {
        if(str1.length() == Math.max(str1.length(), str2.length())) {
            return str1.length() >= 2 * str2.length();
        }
        else{
            return str2.length() >= 2 * str1.length();
        }
    }

    private int getDiffOfLength(String str1, String str2) {
        if(str1.length() == Math.max(str1.length(), str2.length())) {
            return str1.length() - str2.length();
        }
        else{
            return str2.length() - str1.length();
        }
    }

    private int getShortLength(String str1, String str2) {
        return Math.min(str1.length(), str2.length());
    }
}

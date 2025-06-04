public class SimilarityCalculator {
    public int calculateLengthScore(String str1, String str2) {
        if(str1.length() == str2.length()) {
            return 60;
        }

        if(isOneStringLengthDoubleThanOther(str1, str2)) {
            return 0;
        }

        int gap = getDiffOfLength(str1, str2);
        int shortLength = getShortLength(str1, str2);

        return (int) ((1 - (double)gap / shortLength) * 60);
    }

    private boolean isOneStringLengthDoubleThanOther(String str1, String str2) {
        if(str1.length() > str2.length()) {
            return str1.length() >= 2 * str2.length();
        }
        else{
            return str2.length() >= 2 * str1.length();
        }
    }

    private int getDiffOfLength(String str1, String str2) {
        if(str1.length() > str2.length()) {
            return str1.length() - str2.length();
        }
        else{
            return str2.length() - str1.length();
        }
    }

    private int getShortLength(String str1, String str2) {
        if(str1.length() > str2.length()) {
            return str2.length();
        }
        else{
            return str1.length();
        }
    }
}

package hkt.util;

public class StringRule {
    private int minLength;
    private int maxLength;

    public StringRule(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }
}

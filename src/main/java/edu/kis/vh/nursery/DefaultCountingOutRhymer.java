package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUM = 12;
    public static final int TOT = -1;
    public static final int RET = 11;
    private final int[] numbers = new int[NUM];

    public int total = TOT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOT;
    }

    public boolean isFull() {
        return total == RET;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOT;
        return numbers[total--];
    }

}

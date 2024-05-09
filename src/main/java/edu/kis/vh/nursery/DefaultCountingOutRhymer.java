package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int num12 = 12;
    private static final int numMinus1 = -1;
    private static final int num11 = 11;
    private int[] numbers = new int[num12];

    private int total = numMinus1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == numMinus1;
    }

    public boolean isFull() {
        return total == num11;
    }

    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return numMinus1;
        return numbers[total--];
    }

}

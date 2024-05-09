package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int num12 = 12;
    private static int numMinus1 = -1;
    private static int num11 = 11;
    private int[] numbers = new int[num12];

    public static int getNum12() {
        return num12;
    }

    public static void setNum12(int num12) {
        DefaultCountingOutRhymer.num12 = num12;
    }

    public static int getNumMinus1() {
        return numMinus1;
    }

    public static void setNumMinus1(int numMinus1) {
        DefaultCountingOutRhymer.numMinus1 = numMinus1;
    }

    public static int getNum11() {
        return num11;
    }

    public static void setNum11(int num11) {
        DefaultCountingOutRhymer.num11 = num11;
    }

    public int getTotal() {
        return total;
    }

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

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

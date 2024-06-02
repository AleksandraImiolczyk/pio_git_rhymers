package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a simple stack data structure
 * that allows counting in and counting out integers, as well as checking the current state
 * of the stack (whether it is empty or full).
 */
public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int is_empty = -1;
    public static final int max_capacity = 11;
    private int[] numbers = new int[size];

    public int total = is_empty;

    /**
     * @param in the value to be added to the stack
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return true if stack is empty, false if not
     */
    public boolean callCheck() {
        return total == is_empty;
    }

    /**
     * @return true if stack is full, false if not
     */
    public boolean isFull() {
        return total == max_capacity;
    }

    /**
     * @return the top value of the stack if it is not empty, otherwise is_empty
     */
    protected int peekaboo() {
        if (callCheck())
            return is_empty;
        return numbers[total];
    }

    /**
     * @return the top value of the stack if it is not empty, otherwise is_empty
     */
    public int countOut() {
        if (callCheck())
            return is_empty;
        return numbers[total--];
    }

}
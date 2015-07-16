package calculator;

/**
 * Entity represents results of arithmetic
 * operations over two integer numbers
 */
public class Figures {

    //id of the sum procedure
    private final long id;

    //first number of the procedure
    private final int first;

    //second number of the procedure
    private final int second;

    //sum of the two numbers
    private int sum;

    //subtraction of the two numbers
    private int difference;

    //multiplication of the two numbers
    private int multiply;

    /**
     * Object will be constructed in the controller
     */
    public Figures(long id, int first, int second, int sum, int difference, int multiply) {
        this.id = id;
        this.first = first;
        this.second = second;
        this.sum = sum;
        this.difference = difference;
        this.multiply = multiply;
    }

    //Getters and setters
    public long getId() {
        return id;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        sum = first + second;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }
}

package calculator;

/**
 * Entity representing subtraction operation.
 * Will be returned by controller
 */
public class SubtractEntity {

    //id of the subtract operation
    private final long id;

    //result of the subtract operation
    private int result;


    //getters and setters
    public long getId() {
        return id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    /**
     * The object will be constructed in the controller
     *
     * @param id of the subtract operation
     * @param result result of the subtract operation
     */
    public SubtractEntity(long id, int result) {
        this.id = id;
        this.result = result;
    }
}

package calculator;

/**
 * Entity representing multiplication operation.
 * Will be returned by controller
 */
public class MultiplyEntity {

    //id of the multiply operation
    private final long id;

    //result of the multiply operation
    int result;

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
     * @param id of the multiply operation
     * @param result result of the multiply operation
     */
    public MultiplyEntity(long id, int result) {
        this.id = id;
        this.result = result;
    }
}

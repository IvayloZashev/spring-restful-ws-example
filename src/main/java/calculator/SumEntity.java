package calculator;

/**
 * Entity representing sum operation.
 * Will be returned by controller
 */
public class SumEntity {

    //id of the sum operation
    private long id;

    //result of the sum operation
    private int result;

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
     * @param id of the sum operation
     * @param result result of the sum operation
     */
    public SumEntity(long id, int result) {
        this.id = id;
        this.result = result;
    }
}

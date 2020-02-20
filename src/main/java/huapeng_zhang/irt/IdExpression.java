package huapeng_zhang.irt;

/**
 * 标识符表达式
 */
public class IdExpression extends Expression {
    private String id;

    public IdExpression(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

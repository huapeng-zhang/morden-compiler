package huapeng_zhang.irt;

public class OperateExpression extends Expression {
    public enum OperationType {
        PLUS,
        MINUS,
        TIMES,
        DIV
    }

    private OperationType operationType;
    private Expression leftExp;
    private Expression rightExp;

    public OperateExpression(OperationType operationType, Expression leftExp, Expression rightExp) {
        this.operationType = operationType;
        this.leftExp = leftExp;
        this.rightExp = rightExp;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public Expression getLeftExp() {
        return leftExp;
    }

    public Expression getRightExp() {
        return rightExp;
    }
}

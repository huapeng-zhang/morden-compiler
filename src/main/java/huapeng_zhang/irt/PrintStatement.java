package huapeng_zhang.irt;

public class PrintStatement extends Statement {
    public ExpressionList expList;

    public PrintStatement(ExpressionList expList) {
        this.expList = expList;
    }

    public ExpressionList getExpList() {
        return expList;
    }
}

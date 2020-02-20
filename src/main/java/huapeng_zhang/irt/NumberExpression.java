package huapeng_zhang.irt;

public class NumberExpression extends Expression {
    public int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

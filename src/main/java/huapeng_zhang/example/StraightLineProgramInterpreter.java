package huapeng_zhang.example;

import huapeng_zhang.irt.AssignStatement;
import huapeng_zhang.irt.CompoundStatement;
import huapeng_zhang.irt.EseqExpression;
import huapeng_zhang.irt.IdExpression;
import huapeng_zhang.irt.LastExpressionList;
import huapeng_zhang.irt.NumberExpression;
import huapeng_zhang.irt.OperateExpression;
import huapeng_zhang.irt.PairExpressionList;
import huapeng_zhang.irt.PrintStatement;
import huapeng_zhang.irt.Statement;

public class StraightLineProgramInterpreter {
    public static void run() {
        Statement program = new CompoundStatement(
            new AssignStatement(
                "a",
                new OperateExpression(OperateExpression.OperationType.PLUS, new NumberExpression(5), new NumberExpression(3))),
            new CompoundStatement(
                new AssignStatement(
                    "b",
                    new EseqExpression(
                        new PrintStatement(
                            new PairExpressionList(
                                new IdExpression("a"),
                                new LastExpressionList(
                                    new OperateExpression(OperateExpression.OperationType.MINUS, new IdExpression("a"), new NumberExpression(1))))),
                        new OperateExpression(OperateExpression.OperationType.TIMES, new NumberExpression(10), new IdExpression("a")))),
                new PrintStatement(new LastExpressionList(new IdExpression("b")))));
    }
}

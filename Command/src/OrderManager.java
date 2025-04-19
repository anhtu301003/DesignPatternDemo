import java.util.Stack;

public class OrderManager {
    private Stack<OrderCommand> history = new Stack<>();

    public void executeCommand(OrderCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}

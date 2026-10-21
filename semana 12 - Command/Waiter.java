import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orderQueue;

    public Waiter() {
        this.orderQueue = new ArrayList<>();
    }

    public void takeOrder(Command command) {
        orderQueue.add(command);
    }

    public void cancelLastOrder() {
        if (!orderQueue.isEmpty()) {
            Command lastCommand = orderQueue.remove(orderQueue.size() - 1);
            lastCommand.undo();
        }
    }

    public void sendOrdersToKitchen() {
        for (Command command : orderQueue) {
            command.execute();
        }
        orderQueue.clear();
    }
}
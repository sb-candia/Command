public class MakeCoffeeCommand implements Command {
    private CoffeeMachine coffeeMachine;

    public MakeCoffeeCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.makeCoffee();
    }

    @Override
    public void undo() {
        System.out.println("Coffee order cancelled.");
    }
}
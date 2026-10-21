public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Toaster toaster = new Toaster();
        Juicer juicer = new Juicer();

        Command coffeeOrder = new MakeCoffeeCommand(coffeeMachine);
        Command toastOrder = new MakeToastCommand(toaster);
        Command juiceOrder = new MakeJuiceCommand(juicer);

        Waiter waiter = new Waiter();

        waiter.takeOrder(coffeeOrder);
        waiter.takeOrder(toastOrder);
        waiter.takeOrder(juiceOrder);

        waiter.cancelLastOrder();

        waiter.sendOrdersToKitchen();
    }
}
public class MakeToastCommand implements Command {
    private Toaster toaster;

    public MakeToastCommand(Toaster toaster) {
        this.toaster = toaster;
    }

    @Override
    public void execute() {
        toaster.makeToast();
    }

    @Override
    public void undo() {
        System.out.println("Toast order cancelled.");
    }
}
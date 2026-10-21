public class MakeJuiceCommand implements Command {
    private Juicer juicer;

    public MakeJuiceCommand(Juicer juicer) {
        this.juicer = juicer;
    }

    @Override
    public void execute() {
        juicer.makeJuice();
    }

    @Override
    public void undo() {
        System.out.println("Juice order cancelled.");
    }
}
public class CommandLightOn implements Command {
    private final Lights light;

    public CommandLightOn(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
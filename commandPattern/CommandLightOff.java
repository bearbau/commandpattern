public class CommandLightOff implements Command {
    private final Lights light;

    public CommandLightOff(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
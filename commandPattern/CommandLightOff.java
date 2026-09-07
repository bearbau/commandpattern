package commandPattern;

public class CommandLightOff implements Command {
    private final Light light;

    public CommandLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
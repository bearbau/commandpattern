public class CommandLightBrightness implements Command {
    private final Lights light;
    private final int level;

    public CommandLightBrightness(Lights light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        light.setBrightness(level);
    }
}
public class CommandTempIncrease implements Command {
    private final Thermostat thermostat;

    public CommandTempIncrease(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}
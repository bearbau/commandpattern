public class CommandTempDecrease implements Command {
    private final Thermostat thermostat;

    public CommandTempDecrease(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}
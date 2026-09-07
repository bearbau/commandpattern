public class CommandThermostatOff implements Command {
    private final Thermostat thermostat;

    public CommandThermostatOff(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.turnOff();
    }
}
package commandPattern;

public class Thermostat implements Device {
    private int temperature;
    private boolean on;

    public Thermostat() {
        this.temperature = 20; //room temp, tapos celsius siya
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Thermostat is ON (target " + temperature + " degrees Celsius)");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Thermostat is OFF");
    }

    public void increaseTemperature() {
        if (!on) {
            turnOn();
        }
        temperature++;
        System.out.println("Thermostat increased to " + temperature + " degrees");
    }

    public void decreaseTemperature() {
        if (!on) {
            turnOn();
        }
        temperature--;
        System.out.println("Thermostat decreased to " + temperature + " degrees");
    }
}

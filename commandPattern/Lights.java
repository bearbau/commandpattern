package commandPattern;

public class Lights implements Device {
    private final String location;
    private int brightness; 
    private boolean on;

    public Lights(String location) {
        this.location = location;
        this.brightness = 0;
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        brightness = 100; 
        System.out.println(location + " light is ON (brightness " + brightness + "%)");
    }

    @Override
    public void turnOff() {
        on = false;
        brightness = 0;
        System.out.println(location + " light is OFF");
    }

    public void setBrightness(int level) {
        if (!on) {
            turnOn();
        }
        brightness = Math.max(0, Math.min(100, level));
        System.out.println(location + " light brightness set to " + brightness + "%");
    }
}

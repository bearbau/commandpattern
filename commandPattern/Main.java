
public class Main {
    public static void main(String[] args) {
        // Devices
        Light livingRoomLight = new Light("Living Room");
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new CommandLightOn(livingRoomLight);
        Command lightOff = new CommandLightOff(livingRoomLight);
        Command dimLight = new CommandLightBrightness(livingRoomLight, 30);

        Command warmerRoom = new ThermostatIncreaseCommand(thermostat);
        Command coolerRoom = new ThermostatDecreaseCommand(thermostat);

        Command playLofi = new MusicPlayCommand(musicPlayer, "Lofi music");
        Command quieter = new MusicVolumeDownCommand(musicPlayer);

        RemoteControlHub hub = new RemoteControlHub();
        hub.setCommand("light-on", lightOn);
        hub.setCommand("light-off", lightOff);
        hub.setCommand("light-dim", dimLight);
        hub.setCommand("temp-up", warmerRoom);
        hub.setCommand("temp-down", coolerRoom);
        hub.setCommand("music-play", playLofi);
        hub.setCommand("music-quieter", quieter);

        hub.pressButton("light-on");
        hub.pressButton("light-dim");
        hub.pressButton("temp-up");
        hub.pressButton("temp-up");
        hub.pressButton("music-play");
        hub.pressButton("music-quieter");
        hub.pressButton("light-off");
        hub.pressButton("temp-down");

    }
}
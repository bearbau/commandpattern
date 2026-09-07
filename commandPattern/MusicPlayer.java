public class MusicPlayer implements Device {
    private String currentPlaylist;
    private int volume;
    private boolean on;

    public MusicPlayer() {
        this.currentPlaylist = "None";
        this.volume = 50;
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        currentPlaylist = "Chill Mix";
        System.out.println("Music player is ON, playing \"" + currentPlaylist + "\" at volume " + volume);
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Music player is OFF");
    }

    public void playPlaylist(String playlistName) {
        if (!on) {
            turnOn();
        }
        currentPlaylist = playlistName;
        System.out.println("Now playing playlist: " + currentPlaylist);
    }

    public void increaseVolume() {
        if (!on) {
            turnOn();
        }
        volume = Math.min(100, volume + 10);
        System.out.println("Volume increased to " + volume);
    }

    public void decreaseVolume() {
        if (!on) {
            turnOn();
        }
        volume = Math.max(0, volume - 10);
        System.out.println("Volume decreased to " + volume);
    }
}
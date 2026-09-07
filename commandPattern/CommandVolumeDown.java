public class CommandVolumeDown implements Command {
    private final MusicPlayer player;

    public CommandVolumeDown(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.decreaseVolume();
    }
}
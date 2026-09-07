public class CommandMusicOff implements Command {
    private final MusicPlayer player;

    public CommandMusicOff(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.turnOff();
    }
}
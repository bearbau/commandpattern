public class CommandMusicPlay implements Command {
    private final MusicPlayer player;
    private final String playlistName;

    public CommandMusicPlay(MusicPlayer player, String playlistName) {
        this.player = player;
        this.playlistName = playlistName;
    }

    @Override
    public void execute() {
        player.playPlaylist(playlistName);
    }
}
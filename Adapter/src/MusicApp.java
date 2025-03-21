
public class MusicApp {
    private ModernMusicPlayer player;

    public MusicApp(ModernMusicPlayer player) {
        this.player = player;
    }

    public void playSong(String songName) {
        player.playMP3(songName);
    }

    public static void main(String[] args) {
        // Máy CD cũ
        OldCDPlayer oldPlayer = new OldCDPlayer();

        // Dùng Adapter để tương thích
        ModernMusicPlayer adaptedPlayer = new MusicAdapter(oldPlayer);

        // Người dùng phát nhạc
        MusicApp app = new MusicApp(adaptedPlayer);
        app.playSong("Happy Song");
    }
}
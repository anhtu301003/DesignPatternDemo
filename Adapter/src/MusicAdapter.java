// Adapter chuyển từ CD sang MP3
public class MusicAdapter implements ModernMusicPlayer {
    private OldCDPlayer cdPlayer;

    public MusicAdapter(OldCDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Override
    public void playMP3(String songName) {
        System.out.println("Chuyển đổi: Tìm đĩa CD tương ứng với bài '" + songName + "'...");
        cdPlayer.spinCD(songName + " - CD Version");
    }
}
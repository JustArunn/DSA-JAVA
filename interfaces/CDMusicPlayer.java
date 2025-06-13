package interfaces;

public class CDMusicPlayer implements MusicPlayer {

    @Override
    public void start() {
        System.out.println("Music started");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}

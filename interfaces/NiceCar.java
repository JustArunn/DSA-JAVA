package interfaces;

public class NiceCar {
    private Engine engine;
    private final MusicPlayer player;

    NiceCar() {
        this.engine = new PowerEngine();
        this.player = new CDMusicPlayer();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.stop();
    }
}

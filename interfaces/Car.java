package interfaces;

public class Car implements Engine, MusicPlayer{

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");

    }
}

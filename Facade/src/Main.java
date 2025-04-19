
public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, screen);
        homeTheaterFacade.watchMovie("Inception");
        System.out.println("------------------------------------");
        homeTheaterFacade.endMovie();

    }
}

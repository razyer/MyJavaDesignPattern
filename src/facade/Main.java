package facade;

import facade.facade.HomeTheaterFacade;
import facade.subsystem.*;

/**
 * 外观（门面）模式
 *
 * @author tanzhen
 * @date 2018/8/22
 */
public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        CdPlayer cdPlayer = new CdPlayer("CD Player", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("DVD Player", amplifier);
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
        Projector projector = new Projector("Projector", dvdPlayer);
        Screen screen = new Screen("Screen");
        TheaterLights theaterLights = new TheaterLights("Light");
        Tuner tuner = new Tuner("Tuner", amplifier);

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, cdPlayer, dvdPlayer, popcornPopper,
                projector, screen, theaterLights, tuner);

        homeTheaterFacade.watchMoive("The Dark Knight");
        System.out.println("===============");
        homeTheaterFacade.endMovie();
    }
}

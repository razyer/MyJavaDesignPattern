package FacadePattern.facade;

import FacadePattern.subsystem.*;

/**
 * @author tanzhen
 * @date 2018/8/22
 */
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    public void watchMoive(String movie){
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.off();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}

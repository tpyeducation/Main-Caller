package uk.family.polepally.May.Extent;

import uk.family.ecommerce.extents.Movie;

public class TV extends Movie {
    public void BBCIplayer() {
        System.out.println("TV(D): You can watch a movie on BBC Iplayer");
    }

    @Override
    public void Play () {
        System.out.println("TV(D):This is based of a play from TV");
        super.Play();
    }
    @Override
    public void Resume () {
        System.out.println("TV(D):Please resume immediately");
super.Resume();
    }

    @Override
    public void Cancel() {
        System.out.println("TV(D):Cancel now");
        super.Cancel();
    }

    @Override
    public void Stop() {
        System.out.println("TV(D):STOP!!");
        super.Stop();
    }

    @Override
    public void FastForward() {
        System.out.println("TV(D) What would you like to fastforward?");
        super.FastForward();
    }



}

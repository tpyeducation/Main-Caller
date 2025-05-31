package uk.family.polepally.May.Extent;

import uk.family.ecommerce.extents.Movie;

public class Computer extends Movie {
    public void Monitor() {
        System.out.println("I use the monitor to watch");
    }

    @Override
    public void Play() {
        System.out.println("   (D)-This is based of a play");
        super.Play();
    }

    @Override
    public void Stop() {
        System.out.println("   (D)-Stop the movie");
        super.Stop();
    }

    @Override
    public void Resume() {
        System.out.println("  (D)-Resume the movie");
        super.Resume();
    }

    @Override
    public void FastForward() {
        System.out.println("   (D)-Fast forward this part of the movie");
        super.FastForward();
    }

    @Override
    public void Cancel() {
        System.out.println("   (D)-Remove movie from tab");
        super.Cancel();
    }

}

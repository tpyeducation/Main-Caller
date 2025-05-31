package uk.family.polepally.May.Extent;


import uk.family.ecommerce.extents.Movie;

public class Ipad extends Movie {

    public void Appstore() {
        System.out.println("I watch on appstore");
    }
    @Override
    public void Play()
    {
        System.out.println(" (D) Click on the red triangle");
        super.Play();
    }

    @Override
    public void Stop() {
        System.out.println(" (D) Click on the box ");
        super.Stop();
    }

    @Override
    public void Resume() {
        System.out.println("  (D)-Click to resume the video");
        super.Resume();
    }

    @Override
    public void FastForward() {
        System.out.println("   (D)-Click on the 15 secs more symbol");
        super.FastForward();
    }

    @Override
    public void Cancel() {
        System.out.println("   (D)-Click on the X to remove tab");
        super.Cancel();
    }
}


package uk.family.polepally.May.Extent;

import uk.family.ecommerce.extents.Animal;

public class Dog extends Animal {
   public void bark () {
       System.out.println("The dog barks");
   }

   @Override
    public void shout () { //Method Overriding
        System.out.println("Dog barks very loud");
        super.shout(); // super means base / prior class
    }

    public void shout (String sound) { //Method Overloading
        System.out.println("Dog barks very loud:" + sound);
    }

    public void shout (String sound, String abc) { //Method Overloading
        System.out.println("Dog eats bones:" + sound  + abc);
    }
}

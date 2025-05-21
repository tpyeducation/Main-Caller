package uk.family.polepally.yz;

import uk.family.ecommerce.Amazon.AmazonBook;

public class paper {
    public static void main(String[] args) {

        // AmazonBook(int price, int noOfChapters, int noOfPages, String name, String author, String genre)
        // Construuctor defined
        //AmazonBook(String genre, int noOfPages, int price, int noOfChapters, String name, String author)
        AmazonBook myreading = new AmazonBook("Self Improvement", 49, 10, 9,
                "Surrounded by Idiots", "Thomas Erikson");


        //String getAuthor()
        String author = myreading.getAuthor();

        //int getPriceForBooks(int noOfBooks, int price)




        System.out.println(author);
        System.out.println(myreading.getGenre());
        System.out.println(myreading.getName());
        System.out.println(myreading.getPrice());
        System.out.println(myreading.getNoOfPages());
        System.out.println(myreading.getNoOfChapters());

        System.out.println("=======================================");
        AmazonBook muralireading = new AmazonBook("Science",  144 , 20, 49,
                "The business of sleep", "Vicki Culpin" );


        System.out.println(muralireading.getAuthor());
        System.out.println(muralireading.getGenre());
        System.out.println(muralireading.getName());
        System.out.println(muralireading.getPrice());
        System.out.println(muralireading.getNoOfPages());
        System.out.println(muralireading.getNoOfChapters());

    }

}
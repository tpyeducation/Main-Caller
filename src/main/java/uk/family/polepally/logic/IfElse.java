package uk.family.polepally.logic;

public class IfElse {

    public static void main(String args []) {

        int x = 30;
        int y = 10;

        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y = 10");
            } else {
                System.out.println("X = 30 and Y =" + y);
            }
        } else {
            System.out.println("X = " + x);
        }
    }
}

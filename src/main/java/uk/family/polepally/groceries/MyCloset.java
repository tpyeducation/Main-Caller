package uk.family.polepally.groceries;
import uk.family.ecommerce.groceries.asda.Clothes;

public class MyCloset {
    public static void main (String [] args) {
        Clothes clothes = new Clothes();
        clothes.setTops(100);
        clothes.setCoats(100);
        clothes.setDresses(100);
        clothes.setScarfs(100);
        clothes.setShoes(100);
        clothes.setSkirts(100);
        clothes.setSuits(100);
       clothes.setTrousers(100);


        System.out.println(clothes.getTops());
        System.out.println(clothes.getCoats());
        System.out.println(clothes.getDresses());
        System.out.println(clothes.getScarfs());
        System.out.println(clothes.getShoes());
        System.out.println(clothes.getSkirts());
        System.out.println(clothes.getSuits());
        System.out.println(clothes.getTrousers());

}
}

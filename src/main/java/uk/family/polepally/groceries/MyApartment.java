package uk.family.polepally.groceries;

import uk.family.ecommerce.groceries.asda.Furniture;

public class MyApartment {
    public static void main(String[] args) {
        Furniture FF = new Furniture();
        FF.setHeight(223);
        FF.setIndoor("Garden");
        FF.setOutdoor("Kitchen bedroom and living room");
        FF.setLength(59);
        FF.setWidth(45);
        FF.setMaterial("Leather");
        FF.setPrice(100);
        FF.setNoofstock(82);
        FF.setType("Minimalistic");

        System.out.println(FF.getHeight());
        System.out.println(FF.getIndoor());
        System.out.println(FF.getOutdoor());
        System.out.println(FF.getLength());
        System.out.println(FF.getWidth());
        System.out.println(FF.getMaterial());
        System.out.println(FF.getPrice());
        System.out.println(FF.getNoofstock());
        System.out.println(FF.getType());





    }




}

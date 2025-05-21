package uk.family.polepally.ThirteenMay;

import uk.family.ecommerce.commonutils.CommonUtilities;

public class CommonUtilitiesTest {
    public static void main(String[] args) {

        //School sch =    new School();
        CommonUtilities CUEssentials = new CommonUtilities();


        // int GetHour
        int hour = CUEssentials.getHour();
        System.out.println(hour);

        // int GetMinute()
        int minute = CUEssentials.getMinute();
        System.out.println(minute);

        // int getSecond ()
        int second = CUEssentials.getSecond();
        System.out.println(second);

        //int getStringLength (String input)
        int trb = CUEssentials.getStringLength("ThamesRiverBank");
        System.out.println(trb);

        //int GetNoofVowels (String input)
        int gwe = CUEssentials.getNoOfVowels("gas water electricity");
        System.out.println(gwe);

        //String getReversedString(String input)
         String k = CUEssentials.getReversedString("Countryside location");
         System.out.println(k);

        //int getNoOfConsonents(String input)
        int seventyfive = CUEssentials.getNoOfConsonents("Odeon");
        System.out.println(seventyfive);

        //int getHowManyDaysOldIam(String inputDateStr)
         int age = CUEssentials.getHowManyDaysOldIam( "2003-07-10");

        //String getCharAt(String input, int position)
        String x = CUEssentials.getCharAt("abc", 2);
        System.out.println(x);

        //int getStringLength(String input)
        int Key = CUEssentials.getStringLength("Fifty");
        System.out.println(Key);

        //String getAppendedString(String input1, String  input2, String  input3, String  input4, String  input5, String seperatedBy)
        String Lock = CUEssentials.getAppendedString("Door", "Table", "Vanity", "Book",
                "Shelf", ";");
        System.out.println(Lock);

        //public int getStringLengthxx(String input, int i, int j, String pp)
        int q = CUEssentials.getStringLengthxx("Cineworld", 12, 17, "Amazon Prime");
        System.out.println(q);



    }

}

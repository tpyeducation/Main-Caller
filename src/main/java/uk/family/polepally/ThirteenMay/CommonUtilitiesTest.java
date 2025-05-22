package uk.family.polepally.ThirteenMay;

import uk.family.ecommerce.commonutils.CommonUtilities;

public class CommonUtilitiesTest {
    public static void main(String[] args) {

        CommonUtilities CUEssentials = new CommonUtilities();


        // int GetHour
       int abc = CUEssentials.getHour();
       System.out.println(abc);

        // int GetMinute()
        int cde = CUEssentials.getMinute();
        System.out.println(cde);


        // int getSecond ()
        int fg = CUEssentials.getSecond();
        System.out.println(fg);


        //int getStringLength (String input)
       int jkl = CUEssentials.getStringLength("projector");
       System.out.println(jkl);

        //int GetNoofVowels (String input)
        int mnop = CUEssentials.getNoOfVowels("cinema");
        System.out.println(mnop);

        //String getReversedString(String input)
        String qrst = CUEssentials.getReversedString("seaside");
                System.out.println(qrst);

        //int getNoOfConsonents(String input)
          int xyz = CUEssentials.getNoOfConsonents("Jelly");

        //int getHowManyDaysOldIam(String inputDateStr)
        int Age = CUEssentials.getHowManyDaysOldIam("2003-10-07");
          System.out.println(Age);

        //String getCharAt(String input, int position)
        String CharCount = CUEssentials.getCharAt("Bridge", 1);
                System.out.println(CharCount);

        //int getStringLength(String input)
        int StringLength = CUEssentials.getStringLength("Culture");
        System.out.println(StringLength);

        //String getAppendedString(String input1, String  input2, String  input3, String  input4, String  input5, String seperatedBy)
      String Several = CUEssentials.getAppendedString("Furniture", "Bedroom", "Living room", "Bathroom", "Storage",
              ";");
      System.out.println(Several);

        //public int getStringLengthxx(String input, int i, int j, String pp)
       int BMW = CUEssentials.getStringLengthxx("Lights", 12, 14, "Driving license");
       System.out.println(BMW);



    }

}

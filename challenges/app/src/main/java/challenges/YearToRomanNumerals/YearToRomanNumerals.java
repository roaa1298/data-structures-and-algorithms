package challenges.YearToRomanNumerals;

import java.util.Arrays;

public class YearToRomanNumerals {
    public String yearToRoman(String num){
        int[] dec = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] rom = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };


        int numInt=Integer.parseInt(num);
        if (numInt<5000 && numInt>=0){
            StringBuilder romNum=new StringBuilder();
            for (int i=0; i<dec.length ; i++)
            {
              while (numInt>=dec[i])
                {
                    numInt-=dec[i];
                    romNum.append(rom[i]);
                }
            }
            return romNum.toString();
        } else {
            return null;
        }
    }
}

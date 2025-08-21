package aDataTypesInJava;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataTypesInJava {
    public static void main() {

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);  // Output: 0.30000000000000004

        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2)); // Output: 0.3

        //Not Good Way
        BigDecimal b3 = new BigDecimal(d1);
        BigDecimal b4 = new BigDecimal(d2);
        System.out.println(b3.add(b4));

        BigDecimal bd3 = BigDecimal.TEN;
        System.out.println(bd3.add(bd3));

        BigDecimal result = new BigDecimal("10")
                .divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
        System.out.println(result); // 3.33
        // 2 ta xa 1.Primitive Types ra 2. Reference or Object Data Type
 //Non-Decimal Data Type 4 oota xa
        /*
        * 1. byte
        * 2.short
        * 3.int
        * 4. long
        *
        * */

        //Decimal Data Type 4 oota xa
        /*
         * 1. float -> 6 to 7 decimal accuracy
         * 2.Double -> 14 to 15 decimal accuracy
         * */

    }
}

package wrapper_class;

public class BoxingAndUnboxing {

    public static void main(String[] args) {

        // Primitive To Class
        Integer i = Integer.valueOf(10);    // Boxing       - Develop
        Integer ii = 10;                    // AutoBoxing   - Compiler

        // Class To Primitive
        int j = i.intValue();               // Unboxing     - Develop
        int jj = ii;                        // AutoUnboxing - Compiler

        // -----------------------------------------------------

        // Primitive To Class
        Double d = Double.valueOf(12);      // Boxing       - Develop
        Double dd = 10D;                    // AutoBoxing   - Compiler

        // Class To Primitive
        double s = d.doubleValue();         // Unboxing     - Develop
        double ss = dd;                     // AutoUnboxing - Compiler

        double s1   = (double) Double.valueOf(10).intValue();   // Explicit cast int to double
        double s2   = Double.valueOf(10).intValue();            // Implicit cast int to double

        // -----------------------------------------------------

        double dd0 = Integer.valueOf(0);                    // Integer to double with implicit cast
        double dd1 = (double) Integer.valueOf(0);           // Integer to double with explicit cast

        // Double dd2 = 0;                                  // int to Double no implicit cast - COMPILE ERROR
        Double dd2 = (double) 0;                            // int to Double with explicit cast

        // int ii0 =  Double.valueOf(0);                    // Double to int with implicit cast - COMPILE ERROR
        // int ii0 = (int) Double.valueOf(0);               // Double to int with explicit cast - COMPILE ERROR

        int ii0 = (int) (double) Double.valueOf(0);         // Double to double AND double to int with TWO explicit cast
        int ii1 = (int) Double.valueOf(0).doubleValue();    // Double to double no cast AND double to int with explicit cast

        // Integer ii0 = 0D;                                // double to Integer with implicit cast - COMPILE ERROR
        Integer ii2 = (int) 0D;                             // double to Integer with explicit cast

        Integer ii3 = Double.valueOf(0).intValue();         // Double to Integer no cast
    }
}

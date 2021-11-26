package wrapper_class;

public class BoxingAndUnboxing {

    public static void main(String[] args) {

        Integer int_TO_Integer              =   12;                              // AutoBoxing
     // Integer double_TO_Integer           =   12D;                             // COMPILE ERROR

        Integer Integer_TO_Integer          =   Integer.valueOf(12);             // Boxing

        Integer Double_TO_int_TO_Integer    = Double.valueOf(13).intValue();     // Boxing, Unboxing AND AutoBoxing
     // Integer Double_TO_Integer           = Double.valueOf(13);                // COMPILE ERROR

        Integer double_to_int_TO_Integer    = (int)                         12D; // Explicit Cast AND AutoBoxing
        Integer Double_TO_double_TO_Integer = (int) (double) Double.valueOf(10); // Boxing, AutoUnboxing, Explicit Cast AND AutoBoxing

     // ----------------------------------------------------------------------------------------------

     // Double int_TO_Double                    =                0 ;                  // COMPILE ERROR
        Double double_TO_Double                 =                9D;                  // AutoBoxing

        Double int_TO_double_TO_Double          = (double)                        9;  // Explicit Cast AutoBoxing
        Double Integer_TO_int_TO_double_Double1 = (double)       Integer.valueOf(7);  // Boxing, AutoUnboxing, Implicit Cast AND AutoBoxing
        Double Integer_TO_int_TO_double_Double2 = (double) (int) Integer.valueOf(0);  // Boxing, AutoUnboxing, Explicit Cast AND AutoBoxing

        Double Double_TO_Double            = Double.valueOf(9);                       // Boxing
        Double Integer_TO_double_TO_Double = Integer.valueOf(13).doubleValue();       // Boxing, Unboxing AND AutoBoxing
    //  Double Integer_TO_Double           = Integer.valueOf(0);                      // COMPILE ERROR

     // ----------------------------------------------------------------------------------------------

        int Integer_TO_int0          =                Integer.valueOf(11);              // Boxing, AutoUnboxing
        int Integer_TO_int1          =                Integer.valueOf(11).intValue();   // Boxing, Unboxing
     // int double_TO_int            =                Double.valueOf(0).doubleValue();  // COMPILE ERROR

        int Double_TO_double_TO_int1 = (int) (double) Double.valueOf(10);               // Boxing, AutoUnboxing AND Explicit Cast   **Nota: Force AutoUnboxing
        int Double_TO_double_TO_int2 = (int)          Double.valueOf(11).doubleValue(); // Boxing, Unboxing AND Explicit Cast
     // int Double_TO_int            = (int)          Double.valueOf(10);               // COMPILE ERROR


     // ----------------------------------------------------------------------------------------------

        double Double_TO_double0      =         Double.valueOf(11);                  // Boxing, AutoUnboxing
        double Double_TO_double1      =         Double.valueOf(11).doubleValue();    // Boxing, Unboxing

        double int_TO_double      =                             15;
        double Integer_TO_double0 =             Integer.valueOf(15);   // Boxing, AutoUnboxing AND Implicit Cast
        double Integer_TO_double1 =  (double)   Integer.valueOf(15);   // Boxing, AutoUnboxing AND Explicit Cast


    }
}

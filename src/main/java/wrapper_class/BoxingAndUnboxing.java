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

    }
}

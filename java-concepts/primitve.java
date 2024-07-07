package java_concepts;

public class primitive {
    public static void main(String[] args) {
        // byte: 8-bit signed integer
        // Range: -128 to 127
        byte byteExample = 100;
        System.out.println("byte example: " + byteExample);

        // short: 16-bit signed integer
        // Range: -32,768 to 32,767
        short shortExample = 20000;
        System.out.println("short example: " + shortExample);

        // int: 32-bit signed integer
        // Range: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
        int intExample = 100000;
        System.out.println("int example: " + intExample);

        // long: 64-bit signed integer
        // Range: -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long longExample = 10000000000L;
        System.out.println("long example: " + longExample);

        // float: 32-bit floating point
        // Range: approximately ±3.40282347E+38F (6-7 significant decimal digits)
        float floatExample = 5.75f;
        System.out.println("float example: " + floatExample);

        // double: 64-bit floating point
        // Range: approximately ±1.79769313486231570E+308 (15 significant decimal digits)
        double doubleExample = 19.99;
        System.out.println("double example: " + doubleExample);

        // char: 16-bit Unicode character
        // Range: '\u0000' (0) to '\uffff' (65,535)
        char charExample = 'A';
        System.out.println("char example: " + charExample);

        // boolean: true or false
        // Range: true or false
        boolean booleanExample = true;
        System.out.println("boolean example: " + booleanExample);
    }
}

Fundamental programming Structures
----------------------------------


- First program
- Primitive types
- Variables
- Arithmetic Operations
- Strings
- Input and output
- Control flow
- Array
- Functions


First Program
-------------

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Java");
    }
}

//out: Java
```

Primitive types
---------------

```java
public class Main {
    public static void main(String[] args) {

        // byte 8-bit signed
        byte byteMinValue = -128;
        byte byteMaxValue = 127;

        // short 16-bit signed
        short shortMinValue = -32768;
        short shortMaxValue = 32767;

        // int 32-bit signed
        int intMinValue = -2147483648;
        int intMaxValue = 2147483647;

        // long 64-bit signed
        long LONG_MIN_VALUE = -9223372036854775808L;
        long LONG_MAX_VALUE = 9223372036854775807L;

        // float 32-bit signed
        float floatValue = 3.1415f;

        // double 64-bit
        double doubleValue = 3.141512345;

        // unicode 16-bit
        char character = 'c';

    }
}
```




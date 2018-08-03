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
        char a = 'a', b = 'b', c = 'c';

    }
}
```

String
------

```
public class Main {
    public static void main(String[] args) {
        String curta = "Coloca qualquer string aqui que ta valendo";
        String longa = "Podemos concatenar strings cummpridas dessa forma "
                + "sem quebra de linha";

        System.out.println(curta);
        System.out.println(longa);
    }
}

// out: Coloca qualquer string aqui que ta valendo
        Podemos concatenar strings cummpridas dessa forma sem quebra de linha
```


Array
-----

```java
public class Main {
    public static void main(String[] args) {
        int n = 3;

        int[] array = new int[n];
        for(int i = 0 ; i < n; i++){
            array[i] = 0;
        }

        int[][] array2D = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array2D[i][j] = 1;
            }
        }

        int[][][] array3d = new int[n][n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    array3d[i][j][k] = 0;
                }
            }
        }

        System.out.println("1D");
        char[] carray = {'a', 'b'};
        for (char c : carray)
            System.out.printf("%c ", c);
        System.out.println();
        System.out.println();

        System.out.println("2D");
        char[][] carray2d = {{'a', 'b'}, {'c', 'd'}}; // carray2d[2][2]
        for (char[] ca : carray2d) {
            for (char c : ca) {
                System.out.printf("%c ", c);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("3D");
        char[][][] carray3d = {
                {
                        {'a', 'b'},
                        {'c', 'd'}
                },
                {
                        {'e', 'f'},
                        {'g', 'h'}
                }

        };


        for(char[][] ca2d : carray3d){
            for(char[] ca: ca2d){
                for(char c: ca){
                    System.out.printf("%c ", c);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();


    }
}
// out:
/* 
* 1D
  a b 
  
  2D
  a b 
  c d 
  
  3D
  a b 
  c d 
  
  e f 
  g h 
* */ 
```







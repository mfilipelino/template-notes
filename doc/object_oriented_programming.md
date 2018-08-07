## Object-Oriented Programming Concepts
    
- Object
    - Atributes
    - Methods
    - Encapsulation
- Class
- Inheritance
- Interface
- Overload
- Nested Classes  


<a href="https://www.codecogs.com/eqnedit.php?latex=\frac{a}{b}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\frac{a}{b}" title="\frac{a}{b}" /></a> 

### What is an Object?

>    Um objeto é uma forma de abstração do mundo real para uma linguagem de programação, podemos representar uma lampada
>como um objeto, os objetos tem duas caracteristicas state and behave. também podemos delegar ao objeto a
>responsabilidade de modificar seu estado, esse príncipio se chama encapsulamento.

![A Software object](https://docs.oracle.com/javase/tutorial/figures/java/concepts-object.gif)

#### Atributes
> Valores que representa o estado do objeto.

#### Methods
> Execuções de comportamento do objeto que pode ou não mudar seu estado.

#### Encapsulation
>    Quando o estado do seu objeto só pode ser alterado atraves de comportamentos que ele implemente, chamos
> encapsulamento.

### What is a Class?
> Neste exemplo vamos especificar um modelo para objetos do tipo Carro, a forma como especificamos esse modelo é 
> o que chamamos classe, definimos seus atibutos e comportamentos.

```java
class Car {
    
    // atributes
    int fuel = 100;
    int consumptionPerMeter = 1;

    // methods
    void toFuel(int increasesValue) {
        fuel = fuel + increasesValue;
    }

    void move(int meters) {
        fuel = fuel - meters * consumptionPerMeter;
        if (fuel < 0) {
            fuel = 0;
            System.out.println("It turned out fuel");
        }
    }

    public void printState() {
        System.out.println("Car{" +
                "fuel=" + fuel +
                ", consumptionPerMeter=" + consumptionPerMeter +
                '}');
    }
}

public class App {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.move(80);
        car1.toFuel(23);
        car1.printState();

        Car car2 = new Car();
        car2.toFuel(100);
        car2.move(300);
        car2.printState();

    }
}
```    
stdout

    Car{fuel=43, consumptionPerMeter=1}
    It turned out fuel
    Car{fuel=0, consumptionPerMeter=1}

### What Is Inheritance?
> Alguns objetos apresentam comportamentos semelhantes e atributos semelhantes, mais possuem caracteristicas distintas
> que permite agrupalos em diferentes classes de objetos, para tornar comum suas partes e comportamentos semelhantes
> temos o conceito de herança.

![A hirarchy of bicycle classes](https://docs.oracle.com/javase/tutorial/figures/java/concepts-bikeHierarchy.gif)

```java
class Bicycle {
    public Bicycle() {
        System.out.printf("Bicycle");
    }
}

class RoadBike extends Bicycle {
    public RoadBike() {
        System.out.printf("-> RoadBike");
    }
}

class MountainBike extends Bicycle {
    public MountainBike() {
        System.out.println("-> MountainBike");
    }
}

class TandemBike extends Bicycle {
    public TandemBike() {
        System.out.println("-> TandemBike");
    }
}

public class App {

    public static void main(String[] args) {
        new Bicycle();
        System.out.println();
        new RoadBike();
        System.out.println();
        new MountainBike();
        System.out.println();
    }
}
```
stdout

    A
    A-> B
    A-> B-> C
[source](src/main/java/com/mfilipelino/app/App.java)
     

### Interface

> Uma interface especifica um contrato com a especificação dos métodos que a classe que o implementa deve implementar.

```java
interface IntSequence {
    boolean hasNext();
    int next();
}

class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext(){
        return true;
    }

    public int next(){
        i++;
        return i * i;
    }
}


class RandomSequence implements IntSequence {

    private Random random = new Random();

    public boolean hasNext(){
        return true;
    }

    public int next(){
        return random.nextInt();
    }

    public double getDouble(){
        return random.nextDouble();
    }

}

public class InterfaceExample {

    public static double averange(IntSequence seq, int n){
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n){
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0: sum / count;
    }

    public static void main(String[] args) {
        IntSequence sequence;

        sequence = new SquareSequence();
        double vs = averange(sequence, 5);
        System.out.println(vs);

        sequence = new RandomSequence();
        double vr = averange(sequence, 5);
        System.out.println(vr);
    }
}
```



### Atribute static final

```java
class A {

    public A() {
        System.out.println(Bicycle);
    }
}

class B {
    private static final A a = new A();
    public B() {
        System.out.println(RoadBike);
    }
}

public class App 
{
    public static void main( String[] args )
    {
        B b1 = new B();
        B b2 = new B();
    }
}
```
stdout:

    Create A
    Create B
    Create B
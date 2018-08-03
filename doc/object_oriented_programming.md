## Object-Oriented Programming Concepts
    
- What is an Object?
    - Atributes
    - Method
    - Encapsulamento
- Class
- Overload
- Modificadores de acesso
- Inheritance
- Herançca multipla
- Nested Classes  
    
### What is an Object?

>    Um objeto é uma forma de abstração do mundo real para uma linguagem de programação, podemos representar uma lampada
>como um objeto, os objetos tem duas caracteristicas state and behave. também podemos delegar ao objeto a
>responsabilidade de modificar seu estado, esse príncipio se chama encapsulamento.

![A Software object](https://docs.oracle.com/javase/tutorial/figures/java/concepts-object.gif)

#### State
> Valores que representa o estado do objeto.

#### Behave
> Funções que alteram o estado do objeto, ou permite interagir com o objeto.


### What is a Class?
> Uma classe é a especificação de como é um conjunto de objetos, Uma classe é uma especificação de quais atributos e 
> quais são os metodos que esse objeto possui, quais desses atributos e metodos são acessiveis ao mundo externo e quais
> só podem ser acessados internamente.

```java
class Carro {

    // atributos privados so podem ser acessados por métodos da classe
    private String marca; // default = ""
    // valor default
    private int velocidade = 0;
    private int aceleracaoSegundo = 30;
    // variaveis estaticas são variaveis de classe e não de objeto.
    private static final int freio = 10;

    // construtor
    public Carro(String marca) {
        this.marca = marca;
    }

    // construtor overloading
    public Carro(String marca, int aceleracaoSegundo) {
        this.marca = marca;
        this.aceleracaoSegundo = aceleracaoSegundo;
    }
    
    // encapsulamento 
    public void acelerarPor(int segundos) {
        this.velocidade += this.aceleracaoSegundo * segundos;
    }

    public void frearPor(int segundos) {
        this.velocidade -= freio * segundos;
    }

    // controle de acesso
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracaoSegundo=" + aceleracaoSegundo +
                '}';
    }
}

public class App {
    
    public static void main(String[] args) {
        Carro c1 = new Carro("Honda");
        c1.acelerarPor(3);
        c1.frearPor(3);
        System.out.println(c1);

        Carro c2 = new Carro("Ferrari", 100);
        c2.acelerarPor(3);
        c2.frearPor(3);
        System.out.println(c2);
    }
}
```    
stdout

    Carro{marca='Honda', velocidade=60, aceleracaoSegundo=30}
    Carro{marca='Ferrari', velocidade=270, aceleracaoSegundo=100}

#### Encapsulamento 
> Capacidade de esconder do mundo externo a complexidade do objeto, e expor apenas o néscessario para interagir com 
> as outras partes da aplicação. 

      
## Herança

```java
class A {
    public A() {
        System.out.printf("A");
    }
}

class B extends A {
    public B() {
        System.out.printf("-> B");
    }
}

class C extends B {
    public C() {
        System.out.println("-> C");
    }
}



public class App {

    public static void main(String[] args) {
        new A();
        System.out.println();
        new B();
        System.out.println();
        new C();
        System.out.println();
    }
}

```
stdout

    A
    A-> B
    A-> B-> C
     
    
## atribute static final

```java
class A {

    public A() {
        System.out.println("Create A");
    }
}

class B {
    private static final A a = new A();
    public B() {
        System.out.println("Create B");
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
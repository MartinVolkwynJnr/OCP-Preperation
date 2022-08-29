package Chapter8;

public class Zebra extends Animal {
    public Zebra(int age) {
        //super(age);// Refers to constructor in Animal
    }
    public Zebra() {
        this(4);// Referes to constructor in Zebra with int argument
    }
}

package Chapter8;

abstract class Bird{
    public abstract String getName();
    public void printName(){
        System.out.println(getName());
    }
}

public class Stork extends Bird {
    public String getName(){ return "Stork!";}
    public static void main(String[] args){
        new Stork().printName();
    }
}

public abstract class Turtle(){
    public abstract long eat()      // DNC - missing ;
        public abstract void swim() {}; // DNC - marked abstract but has implementation
    public abstract int getAge() {
        return 10;
    } // DNC - marked abstract but has implementation
    public void sleep;  // DNC - missing parentheses
    public void goInShell(); // DNC - not marked as abstract and has no implementation
}

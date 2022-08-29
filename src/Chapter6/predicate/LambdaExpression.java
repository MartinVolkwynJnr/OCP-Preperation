package Chapter6.predicate;

import Chapter6.Example.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));

        //predicate
        print(animals, a -> a.canHop());

        //consumer
        Consumer<String> consumer = x -> System.out.println(x);
        printC(consumer,"Hello World");

        //supplier
        Supplier<Integer> random = () -> new Random().nextInt();
        for (int i = 0; i < 5; i++)
            System.out.println("New Random number is -> " + returnRandomNumber(random));  // using method to do so

        for (int i = 0; i < 5; i++)
            System.out.println("New Random number is -> " + random.get()); // direct supplier get call

        //Comparator


    }

    // predicate   Predicate<T> variableName
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for(Animal animal: animals) {
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

    // Consumer   ------>  consumer.accept(value);
    private static void printC(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }

    // supplier  ------> supplier.get();
    private static int returnRandomNumber(Supplier<Integer> supplier){
//        Supplier<Integer> number = () -> 42;  // always prints 42 when numer is referenced
//        Supplier<Integer> random = () -> new Random().nextInt(); // alwyas generates new random number when random is called
        return supplier.get();
    }

    //Comparator  ----->int compare(T o1, T o2)
    /*
        1. return < 0 => first value = smaller than second value
        2. return > 0 => first value = larger than second value
        3. return = 0 => first value = second value
     */
    private static void Comparator(){
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);   // decending because of the s2 is compared to s1 (reversed)
        Comparator<String> moreStrings = (s1, s2) -> - s1.compareTo(s2);  // decending because of the negate sign
        Comparator<Integer> ints = (i1, i2) -> i1 - i2;  // the ints comparator uses natural sort order. if the
                    // first number is bigger, it will return a positive
    }
}

package Chapter6;

import Chapter6.Example.Animal;
import Chapter6.Example.CheckIfHopper;
import Chapter6.Example.CheckTrait;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChapterSix {
    private String color;

    public static void main(String[] args) {
        //list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //pass class that does check
        print(animals, new CheckIfHopper()); // without lambda

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
        print(animals, a -> !a.canSwim());


        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("fluffy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // ["long ear", "fluffy", "hoppy"]
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies); // ["fluffy", "hoppy", "long ear"]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // ["long ear", "fluffy"]
        bunnies.forEach(b -> System.out.println(b));


        Map<String, Integer> bunniesMap = new HashMap<>();

        bunniesMap.put("long ear",1);
        bunniesMap.put("fluffy",2);
        bunniesMap.put("hoppy",3);
        bunniesMap.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }

    public void variables () {
        Comparator<Integer> tComparator = (a, b) -> {
            int c = 0;
            return 5;
        };
    }

    public void caw(String name){
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                    + volume + " that she is " + color);
    }


    public void caw1(final String name){
        final String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for(Animal animal : animals){
            // the general check
            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

    public static void lambda(){

    }
}

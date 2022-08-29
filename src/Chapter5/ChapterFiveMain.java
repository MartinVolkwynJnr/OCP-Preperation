package Chapter5;

import java.util.*;

public class ChapterFiveMain {
    public static void main(String[] args) {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey

//        int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = i + 5;
//        }

        int[] numbers = { 6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + ""); // 1,6,9
        }

        int[] numbers1 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers1,2)); // 0
        System.out.println(Arrays.binarySearch(numbers1,4)); // 1
        System.out.println(Arrays.binarySearch(numbers1,1)); // -1
        System.out.println(Arrays.binarySearch(numbers1,3)); // -2
        System.out.println(Arrays.binarySearch(numbers1,9)); // -5


        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++){
            for(int j = 0; j< twoD[i].length;j++){
                System.out.println(twoD[i][j] + "  ");// print element
            }
            System.out.println();//new row
        }

        for (int[] inner: twoD){
            for(int num: inner){
                System.out.println(num + " ");
            }
        }


        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();


        String[] array = {"hawk", "robin"};     // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size());    // 2
        list.set(1,"test");     // [hawk, test]
        array[0] = "new";       // [new, test]
        System.out.println(Arrays.toString(array)); // [new, test]
        list.remove(1);     // throws UnsupportedOperstionException

        String[] array1 = {"hawk", "robin"};     // [hawk, robin]
        List<String> list2 = List.of(array1); // returns fixed size list
        System.out.println(list2.size());    // 2
        list2.set(1,"test");     // [hawk, test]
        array1[0] = "new";       // [new, test]
        System.out.println(Arrays.toString(array1)); // [new, test]
        list2.remove(1);     // throws UnsupportedOperstionException



        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        String food = map.get("koala"); // bamboo
        String other = map.getOrDefault("ant", "leaf"); // leaf
        for (String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }

    public static void ImportantStringMethods(){
        String s1 = "12345";
        String s2 = "martin";
        String s3 = "Hello World";

        // string methods:
        System.out.println(s1.length()); // 5
        System.out.println(s2.charAt(3));// t
        System.out.println(s3.indexOf('l'));// 2
        System.out.println(s1.substring(1,4));//234
        System.out.println(s3.toLowerCase()); // hello world
        System.out.println(s3.toUpperCase()); // HELLO WORLD
        System.out.println(s1.equals("12345")); // true
        System.out.println(s3.equalsIgnoreCase("hello WORLD")); // true
        System.out.println(s2.startsWith("mar")); // true
        System.out.println(s2.endsWith("tin")); // true
        System.out.println(s3.contains(" ")); // true
        System.out.println(s2.replace("martin","michelle")); // michelle
        System.out.println("    Hello World   ".trim().equals(s3));// method chaining and wil return true.
        System.out.println("    Hello World   ".trim()); // Hello World
        System.out.println("    Hello World   ".strip()); // Hello World
        System.out.println("    Hello World   ".stripLeading()); // "Hello World   "
        System.out.println("    Hello World   ".stripTrailing()); // "    Hello World"
        System.out.println(s2.intern());
    }

    public static void Comparing(){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }
}

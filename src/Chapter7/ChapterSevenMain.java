package Chapter7;

import java.util.List;

public class ChapterSevenMain {
    public static void main(String[] args){
        int num = 1;                            // num = 1
        String letters = "abc";                 // letters = abc
        number(num);                            // num = 1
        letters = letters(letters);             // letters=abcd
        System.out.println(num + " " + letters); // 1abcd
    }

    private static String letters(String letters) {
        letters += "d";
        return letters;
    }

    private static int number(int num) {
        num++;
        return num;
    }

    public void walk(int[] ints) {}
    public void walk(Integer[] integers) {}

}

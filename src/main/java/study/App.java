package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Integer> strings1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> strings2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        strings1.removeAll(strings2);
        System.out.println(strings1);
    }
}

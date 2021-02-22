package com.example.java9features;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Predicate;

/**
 * @author akshay on 18/02/21
 */
public class SimpleLanguageModifications {
    public static void effectiveFinalDemo() throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("/Users/akshay/bit_bucket/LifeBeyondJava8/src/main/resources/file.txt"));
        try (scanner) {
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        System.out.println(scanner.next());
    }

    public static void main(String[] args) throws FileNotFoundException {
//        SimpleLanguageModifications.effectiveFinalDemo();
        SimpleLanguageModifications.immutableSetDemo();

    }

    private static void immutableSetDemo() {
        Set<String> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new String [] {"Java", "Java8", "Kotlin","Scala"}));
        set2.removeIf(Predicate.isEqual("Java"));
        System.out.println(set2);

        Set<String> set = Set.of("Java", "Java8", "Kotlin","Scala");
        set.removeIf(Predicate.isEqual("Java"));
        System.out.println(set);
    }
}

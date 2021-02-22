package com.example.java9features;

import java.util.*;

/**
 * @author akshay on 18/02/21
 */
public interface InterfaceWithLengthyDefaultMethods {
    default void doSomethingBig(){
        Set<String> set = createSet();
        printCollection(set);
    }

    private<T extends Collection> void printCollection(T collection){
        System.out.println(collection);
    }

    private Set<String> createSet(){
        Set set = new LinkedHashSet();
        set.addAll(Arrays.asList("Thank", "god", "its", "friday"));
        return set;
    }

    public static void main(String[] args) {
        InterfaceWithLengthyDefaultMethods interfaceDemo = new InterfaceWithLengthyDefaultMethods() {};
        interfaceDemo.doSomethingBig();
    }
}

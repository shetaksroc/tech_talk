package com.example.java10features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akshay on 18/02/21
 */
public class Java10 {
    List<Integer> originalList=new ArrayList<>(Arrays.asList(1,2,3));

    void localVariableTypeInference(){
        var num= Integer.valueOf(10);
        var arrayList = new ArrayList<>();
        System.out.println("Is Integer?"+ (num instanceof Integer));
        System.out.println("Is List? "+ (arrayList instanceof List));
    }

    void unmodifiableCollections(){

        List<Integer> copyList = List.copyOf(originalList);
//        copyList.add(4);
        originalList.add(4);


    }

    void unmodifiableList(){
        try{
            List<Integer> evenList = originalList.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toUnmodifiableList());
            evenList.add(4);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Java10 java10=new Java10();
        java10.localVariableTypeInference();
//        java10.unmodifiableCollections();
//        java10.unmodifiableList();
    }
}

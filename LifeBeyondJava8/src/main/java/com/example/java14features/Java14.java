package com.example.java14features;

/**
 * @author akshay on 18/02/21
 */
public class Java14 {

    public record User(int id, String password) { };

    public static void main(String[] args) {
        User user1 = new User(0, "UserOne");
        System.out.println(user1.toString());
        System.out.println(user1.id());
    }
}

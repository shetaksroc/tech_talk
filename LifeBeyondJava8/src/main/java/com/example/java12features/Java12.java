package com.example.java12features;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author akshay on 18/02/21
 */
public class Java12 {
    public static void main(String[] args) {
        String st = "test";
        st.transform(value -> new StringBuilder(value).reverse().toString());

        // Old way
        Object obj = "Sample String!";
        if (obj instanceof String) {
            String s = (String) obj;
            int length = s.length();
        }

        // preview feature in 12
        if (obj instanceof String s) {
            int length = s.length();
        }

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("Working Day");
                System.out.println("Working Day");
            }
            case SATURDAY, SUNDAY -> System.out.println("Day Off");
        }

    }
}

package com.example.java13features;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author akshay on 18/02/21
 */
public class Java13 {
    public static void main(String[] args) {
        var me = 4;
        var operation = "squareMe";
        var result = switch (operation) {
            case "doubleMe" -> {
                yield me * 2;
            }
            case "squareMe" -> {
                yield me * me;
            }
            default -> me;
        };
    }


    String TEXT_BLOCK_JSON = """
    {
    "client" : "centralpet",
    "clientId" : "549"
    }
    """;
}

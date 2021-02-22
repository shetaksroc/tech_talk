package com.example.java11features;

import com.example.java10features.Java10;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author akshay on 18/02/21
 */
public class Java11 {
    public static void main(String[] args) throws ScriptException {
        String s = "test";
        s.isBlank();
        s.lines();
        s.strip();
        s.stripLeading();
        s.stripTrailing();
        s.repeat(2);
//         unicode 10 15000 new chars added
        System.out.println("\u20BF");

//        ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
//        engine.eval("var a='js var'; print('hello');print(a);");

    }
}

package com.jonmax;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TestWR {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        properties.load(new FileReader("pll-test/src/testp.txt"));
        //properties.stringPropertyNames();
        properties.forEach((k,v)->{
            System.out.println("key============="+k+"========value"+"=================="+v);
        });
        System.out.println(properties);
        if (properties.containsKey("麦")){
            properties.setProperty("麦","18");
        }
        properties.store(new FileWriter("pll-test/src/testp.txt"),"success");
        System.out.println(properties);
    }
}

package com.jonmax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();

        properties.load(Main.class.getClassLoader().getResourceAsStream("user.properties"));
//        System.out.println(properties);
//        System.out.println(properties.getProperty("name"));
//        System.out.println(properties.getProperty("pwd"));

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value=properties.getProperty(key);
            System.out.println(key+">>>>>>>>>>>>>>>"+value);
        }
        properties.forEach((k,v)->{
            System.out.println(k+">>>>>>>>>>>>>>>"+v);
        });
    }
}
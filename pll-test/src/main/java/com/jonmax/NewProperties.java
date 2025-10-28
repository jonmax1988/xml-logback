package com.jonmax;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class NewProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.setProperty("lees","xxxx");
        properties.setProperty("lees2","xxxx2");
        properties.setProperty("lees3","xxxx3");
        properties.store(new FileWriter("pll-test/src/newp.properties"),"测试jonmax");
        Path projectDir = Paths.get(System.getProperty("user.dir"));
        System.out.println(projectDir);
        //Path outputPath=  projectDir.resolve("src/jonmax/new1.properties");
        //outputPath.toAbsolutePath();
    }
}

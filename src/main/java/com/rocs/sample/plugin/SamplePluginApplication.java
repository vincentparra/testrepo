package com.rocs.sample.plugin;

import java.io.FileWriter;
import java.io.IOException;

public class SamplePluginApplication {
    public static void main(String[] args) {
        String name = System.getenv("INPUT_NAME");
        String message = "Hello, " + name;

        try (FileWriter writer = new FileWriter(System.getenv("GITHUB_OUTPUT"), true)) {
            writer.write("message=" + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Java Action executed with name: " + name);
    }
}

package com.uvi;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static String getGreeting(String name) {
        if (name.length() > 0) {
            return "Hello "+name+".";
        }
        return null;
    }

}

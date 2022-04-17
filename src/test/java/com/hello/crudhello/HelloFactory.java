package com.hello.crudhello;

import com.hello.crudhello.model.Hello;

public class HelloFactory {
    public static Hello createGreeting(){
        Hello hello = new Hello();
        hello.setGreeting("Hi");
        return hello;
    }
}

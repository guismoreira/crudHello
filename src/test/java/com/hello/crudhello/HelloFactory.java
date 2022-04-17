package com.hello.crudhello;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.model.Hello;

public class HelloFactory {
    public static Hello createGreeting(){
        Hello hello = new Hello();
        hello.setId(1L);
        hello.setGreeting("Hi");
        return hello;
    }

    public static HelloDTO createGreetingDTO(){
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setId(1L);
        helloDTO.setGreeting("Hi");
        return helloDTO;
    }
}

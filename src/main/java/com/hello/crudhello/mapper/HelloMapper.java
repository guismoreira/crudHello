package com.hello.crudhello.mapper;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.model.Hello;

public class HelloMapper {
    public static HelloDTO toDto(Hello hello){
        return HelloDTO.builder()
                .id(hello.getId())
                .greeting(hello.getGreeting())
                .build();
    }

    public static Hello toHello(HelloDTO helloDTO){
        return Hello.builder()
                .greeting(helloDTO.getGreeting())
                .build();
    }
}

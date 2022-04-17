package com.hello.crudhello.mapper;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.model.Hello;

public class HelloMapper {
    public static HelloDTO toDTO(Hello hello){
        return HelloDTO.builder()
                .id(hello.getId())
                .greeting(hello.getGreeting())
                .build();
    }

    public static Hello toHello(HelloDTO helloDTO){
        return Hello.builder()
                .id(helloDTO.getId())
                .greeting(helloDTO.getGreeting())
                .build();
    }
}

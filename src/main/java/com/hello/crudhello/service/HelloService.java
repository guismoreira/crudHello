package com.hello.crudhello.service;

import com.hello.crudhello.model.Hello;
import com.hello.crudhello.repository.HelloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {
    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Hello saveHello(Hello hello){
        return helloRepository.save(hello);
    }

    public List<Hello> findAllHello(){
        return helloRepository.findAll();
    }

}

package com.hello.crudhello.service;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.mapper.HelloMapper;
import com.hello.crudhello.model.Hello;
import com.hello.crudhello.repository.HelloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class HelloService {
    private final HelloRepository helloRepository;
    private HelloMapper helloMapper;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Hello saveHello(Hello hello){
        return helloRepository.save(hello);
    }

    public List<HelloDTO> findAllHello(){
        return helloRepository.findAll()
                .stream()
                .map(HelloMapper::toDto)
                .toList();
    }

}

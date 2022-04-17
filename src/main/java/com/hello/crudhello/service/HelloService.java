package com.hello.crudhello.service;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.mapper.HelloMapper;
import com.hello.crudhello.model.Hello;
import com.hello.crudhello.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public HelloDTO saveHello(HelloDTO helloDTO){
        Hello hello = HelloMapper.toHello(helloDTO);
        hello.setId(null);
        return HelloMapper.toDTO(helloRepository.save(hello));
    }

    public List<HelloDTO> findAllHello(){
        return helloRepository.findAll()
                .stream()
                .map(HelloMapper::toDTO)
                .toList();
    }

}

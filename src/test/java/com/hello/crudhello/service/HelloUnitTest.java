package com.hello.crudhello.service;

import com.hello.crudhello.dto.HelloDTO;
import com.hello.crudhello.mapper.HelloMapper;
import com.hello.crudhello.model.Hello;
import com.hello.crudhello.repository.HelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.hello.crudhello.HelloFactory.createGreeting;
import static com.hello.crudhello.HelloFactory.createGreetingDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelloUnitTest {

    @Mock
    private HelloRepository helloRepository;

    @InjectMocks
    private HelloService helloService;

    @Test
    @DisplayName("Should list greetings")
    void shouldListGreetings(){
        List<HelloDTO> helloListDTO = List.of(createGreetingDTO());
        List<Hello> helloList = List.of(createGreeting());
        when(helloRepository.findAll()).thenReturn(helloList);
        assertEquals(helloListDTO, helloService.findAllHello());
    }
}

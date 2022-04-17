package com.hello.crudhello.control;

import com.hello.crudhello.model.Hello;
import com.hello.crudhello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping
    public ResponseEntity<Hello> saveHello(@RequestBody Hello hello){
        return new ResponseEntity<>(this.helloService.saveHello(hello), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hello>> listHello(){
        List<Hello> hello = this.helloService.findAllHello();
        return ResponseEntity.ok(hello);
    }
}

package com.hello.crudhello.control;

import com.hello.crudhello.dto.HelloDTO;
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
    public ResponseEntity<HelloDTO> saveHello(@RequestBody HelloDTO helloDTO){
        return new ResponseEntity<>(this.helloService.saveHello(helloDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HelloDTO>> listHello(){
        List<HelloDTO> hello = this.helloService.findAllHello();
        return ResponseEntity.ok(hello);
    }
}

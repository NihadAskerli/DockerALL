package com.example.dockerimage.controller;


import com.example.dockerimage.models.DockerTest;
import com.example.dockerimage.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @GetMapping("/all")
    public ResponseEntity<List> getAllTest(){
        return ResponseEntity.ok(testService.getAllTest());
    }
    @GetMapping("/{name}")
    public ResponseEntity<DockerTest> getTestByName(@PathVariable String name){
        return ResponseEntity.ok(testService.getTestByName(name));
    }
    @PostMapping("/save")
    public ResponseEntity<DockerTest> saveTest(@RequestBody DockerTest test){
        return ResponseEntity.ok( testService.saveTest(test));
    }
}

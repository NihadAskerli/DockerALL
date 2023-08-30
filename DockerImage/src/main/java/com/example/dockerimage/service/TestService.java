package com.example.dockerimage.service;

import com.example.dockerimage.models.DockerTest;
import com.example.dockerimage.repo.TestRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepo testRepo;
    public List<DockerTest> getAllTest(){
        return testRepo.findAll();
    }
    public DockerTest saveTest(DockerTest test){
        return testRepo.save(test);
    }
    public DockerTest getTestByName(String name){
        return testRepo.findByName(name).orElseThrow(() -> new NoSuchElementException("Bele bir element yoxdur"));
    }
}

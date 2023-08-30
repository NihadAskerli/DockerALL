package com.example.dockerimage.repo;

import com.example.dockerimage.models.DockerTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestRepo extends JpaRepository<DockerTest,Integer> {
    Optional<DockerTest> findByName(String name);

}

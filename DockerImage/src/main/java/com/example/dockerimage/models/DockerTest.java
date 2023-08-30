package com.example.dockerimage.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "docker")
public class DockerTest {
    @Id
    @SequenceGenerator(name = "docker_seq",allocationSize = 1)
    @GeneratedValue(generator = "docker_seq")
    Integer id;
    String name;
    String surname;
}

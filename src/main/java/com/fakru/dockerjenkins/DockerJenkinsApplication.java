package com.fakru.dockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsApplication.class, args);
    }
}

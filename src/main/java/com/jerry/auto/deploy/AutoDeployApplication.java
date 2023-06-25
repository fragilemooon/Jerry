package com.jerry.auto.deploy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AutoDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoDeployApplication.class, args);
        log.info("AutoDeploy started...");
    }

}

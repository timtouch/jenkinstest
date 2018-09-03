package com.revature.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JenkinsTestApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }
}

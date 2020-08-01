package com.test.externalFundTransfer.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude={MongoAutoConfiguration.class})
//
public class LoginwithApi {
    public static void main(String args[])
    {
        SpringApplication.run(LoginwithApi.class,args);
      //  ApplicationContext context= new AnnotationConfigApplicationContext();


    }
}

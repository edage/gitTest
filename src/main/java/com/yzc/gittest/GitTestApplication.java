package com.yzc.gittest;

import com.yzc.gittest.controller.loginController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println(111);
        loginController loginController = new loginController();
        loginController.getId("111");
        System.out.println("测试测试11111112022");

    }

}

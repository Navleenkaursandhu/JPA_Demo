package jpa.demo.learning.project.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogApp {

    @After("execution(* jpa.demo.learning.project.service.UserService.*(..))")
    public void res(){
        System.out.println("*************output*************");
    }
}

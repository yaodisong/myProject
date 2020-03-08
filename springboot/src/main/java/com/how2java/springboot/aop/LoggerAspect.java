package com.how2java.springboot.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Around("execution(* com.how2java.springboot.web.HelloController.*(..)) || execution(* com.how2java.springboot.web.CategoryController.*(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("start log:" + pjp.getSignature().getName());
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        Object object = pjp.proceed();
        System.out.println("end log:" + pjp.getSignature().getName());
        return object;
    }

    @Before("execution(* com.how2java.springboot.web.HelloController.*(..))")
    public void befLog(JoinPoint joinPoint){
        System.out.println("[Aspect1] before advise");
    }

    @After("execution(* com.how2java.springboot.web.HelloController.*(..))")
    public void AftLog(JoinPoint joinPoint){
        System.out.println("[Aspect1] after advise");
    }

    @AfterReturning("execution(* com.how2java.springboot.web.HelloController.*(..))")
    public void AftRLog(JoinPoint joinPoint){
        System.out.println("[Aspect1] afterReturning advise");
    }

    @AfterThrowing("execution(* com.how2java.springboot.web.HelloController.*(..))")
    public void AftTLog(JoinPoint joinPoint){
        System.out.println("[Aspect1] afterThrowing advise");
    }
}






































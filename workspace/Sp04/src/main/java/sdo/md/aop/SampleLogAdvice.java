package sdo.md.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Aspect
@Component
public class SampleLogAdvice {
	@Before("execution(* sdo.md.service.SampleLogService*.*(..))")
	public void logBefore() {
		log.info("#logBefore() 수행");
	}
	
	@Around("execution(* sdo.md.service.SampleLogService*.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		
		log.info("#target class : " + pjp.getTarget().getClass());
		log.info("#args : " + Arrays.toString(pjp.getArgs()));
		
		Object result = null;
		try {
			result = pjp.proceed(); //비지니스 메소드로 진행하도록 하는 메소드  
		}catch(Throwable t) {
			 log.info("#예외발생 t: " + t);
		}
		
		long end = System.currentTimeMillis();
	    log.info("#수행시간: " + (end-start));
	    
	    return result;
	}
	
	@After("execution(* sdo.md.service.SampleLogService*.*(..))")
	public void logAfter() {
		log.info("#logAfter() 수행");
	}
	@AfterThrowing(pointcut="execution(* sdo.md.service.SampleLogService*.*(..))", throwing = "exception")
	public void logAfterThrowing(Exception exception) {
		log.info("#logAfterThrowing() exception: " + exception);
	}
}

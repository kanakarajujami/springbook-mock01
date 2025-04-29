package com.nt.log;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	private Logger logger=Logger.getLogger(LogAspect.class.getName());
	
	@Around("execution(* com.nt.service.VehicleServices .*(..))")
	public  Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		
		      logger.info(joinPoint.getSignature().getName()+" execution started...");
		      Instant start=Instant.now();
		      Object result=joinPoint.proceed();
		      Instant end=Instant.now();
		      Long timeElapsed=Duration.between(start, end).toMillis();
		      logger.info("time took to execute the method:"+timeElapsed+" ms");
		      logger.info(joinPoint.getSignature().getName()+" method execution end...");
		     return    result;
			}
	
			/*
			 * @Around("execution(* com.nt.service.VehicleServices.moveVehicle(boolean))")
			 * public Object logAround2(ProceedingJoinPoint joinPoint) throws Throwable {
			 * 
			 * logger.info(joinPoint.getSignature().getName()+" execution started...");
			 * Instant start=Instant.now(); Object result=joinPoint.proceed(); Instant
			 * end=Instant.now(); Long timeElapsed=Duration.between(start, end).toMillis();
			 * logger.info("time took to execute the method:"+timeElapsed+" ms");
			 * logger.info(joinPoint.getSignature().getName()+" method execution end...");
			 * return result; }
			 */
	
			/*
			 * @Around("execution(* com.nt.service.VehicleServices.applyBrake(boolean))")
			 * public Object logAround3(ProceedingJoinPoint joinPoint) throws Throwable {
			 * 
			 * logger.info(joinPoint.getSignature().getName()+" execution started...");
			 * Instant start=Instant.now(); Object result=joinPoint.proceed(); Instant
			 * end=Instant.now(); Long timeElapsed=Duration.between(start, end).toMillis();
			 * logger.info("time took to execute the method:"+timeElapsed+" ms");
			 * logger.info(joinPoint.getSignature().getName()+" method execution end...");
			 * return result; }
			 */
}

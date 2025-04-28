package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.FlipkartConfig;
import com.nt.service.FlipkartService;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(FlipkartConfig.class);
      
      //get flipkart service bean
      
      FlipkartService service=context.getBean(FlipkartService.class);
      
      service.processPayment(500.0);
      service.validatePayment("trxn3456");
      service.refundPayment("trxn7658");
    }
}

package com.demo.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Core
 *
 */
public class App
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(ClassBean.class);
        
        Tyre obj =(Tyre) context.getBean("TyreBean",Tyre.class);
      System.out.println(obj);
        //obj.drive();
        
         
        
        // Vehicle obj = (Vehicle)context.getBean("vehicle");
         //  obj.drive();
        // Vehicle obj = new Car();
     
    }
}








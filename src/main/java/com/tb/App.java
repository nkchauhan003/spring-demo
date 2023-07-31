package com.tb;

import com.tb.beans.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.tb");
        applicationContext.refresh();

        var employeeBean = (Employee) applicationContext.getBean("employee");
        System.out.println("Employee Name: "+employeeBean.getName());

    }
}

package com.elgin.sfgdi;

import com.elgin.sfgdi.controllers.ConstructorInjectedController;
import com.elgin.sfgdi.controllers.MyController;
import com.elgin.sfgdi.controllers.PropertyInjectedController;
import com.elgin.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primaty Bean");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor");
        ConstructorInjectedController contructorInjectedController = (ConstructorInjectedController) ctx.getBean("contructorInjectedController");
        System.out.println(contructorInjectedController.getGreeting());
	}

}

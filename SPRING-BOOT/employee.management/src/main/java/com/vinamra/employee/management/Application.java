package com.vinamra.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vinamra.employee.management.scope.SingletonBean;
import com.vinamra.employee.management.scope.PrototypeBean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Application.class, args);

        System.out.println("---- SINGLETON ----");
        SingletonBean s1 = context.getBean(SingletonBean.class);
        SingletonBean s2 = context.getBean(SingletonBean.class);
        System.out.println(s1 == s2);

        System.out.println("---- PROTOTYPE ----");
        PrototypeBean p1 = context.getBean(PrototypeBean.class);
        PrototypeBean p2 = context.getBean(PrototypeBean.class);
        System.out.println(p1 == p2);
    }
}

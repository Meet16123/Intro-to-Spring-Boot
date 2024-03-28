package com.learningSpring.learnspring.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

public class App02HelloSpring {
    public static void main(String[] args) {
        //1. Launch a Spring Context.
        //2. Configure the things that we want Spring to manage -
        //HelloWorldConfiguration - @Configuration.
        try( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("address3"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean(Address.class));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBeanDefinition("address3"));
        }

    }
}

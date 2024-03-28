package com.learningSpring.learnspring.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Meet";
    }
    @Bean
    public int age() {
        return 20;
    }
    @Bean
    public Person person() {
        return new Person("Ravi", 30, new Address("Lent Street", "Brampton"));
    }

    @Bean(name = "address")
    @Primary
    public Address address() {
        return new Address("Dalhousie Street", "Woodbridge");
    }
    @Bean(name = "address3")
    @Qualifier
    public Address address3() {
        return new Address("Shivdham Soci", "Rajkot");
    }

    //Resusing Beans using already defined beans.
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    //Resusing Beans by passing parameters value which are already defined beans.
    @Bean
    @Primary
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5QualifierString(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }
}

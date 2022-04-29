package model;

import java.io.Serializable;
//This is just a simple java class that represents a Person
//but it follows the JavaBean specification.

//1. Implements Serializable
//2. No arg constructor
//3. private members w/ getters and setters

//Following that pattern is a good idea for a couple of reasons
//but for this its good because an object needs to be Serializable
//to be sent across data streams.

//https://www.geeksforgeeks.org/pojo-vs-java-beans/

//Java Bean 3 rules
//1. implements serializable
//2. no arg constructor
//3.private members wih getters and setters
public class Person implements Serializable {
//model data into object
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName="Zamin";
        this.lastName="Ismayilov";
        this.age=38;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

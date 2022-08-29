package com.example.mathservice;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Customer(){
        this("", null, "female",0);
    }
    public Customer(String ID, String n, boolean s, int a){
        if(s.equals("Male") || s.equals("male")){
            this.sex = true;
        }
        else{
            this.sex = false;
        }
        if(age < 0) {
            this.age = 0;
        }
        else{
            this.age = a;
        }
        this.name = n;
        this.ID = ID;
    }
}

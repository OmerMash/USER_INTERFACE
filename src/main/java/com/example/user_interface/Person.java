package com.example.user_interface;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.io.Serializable;

public class Person implements Serializable {
    private int personCounter = 0;
    private int age;
    private String ID;
    private String name;
    private String profession;
    private int experience_y;
    private Operation operation;
    private int min_age;
    private int max_age;
    private int min_years_of_experienc;

    public String toJson() {
        return "{" + "name:"+ this.name + " ,age:" + this.age + " ,ID:" + this.ID + " ,profession:" + this.profession
                + " ,experience_y:" + this.experience_y + " ,operation:" + this.operation + ",min_age:" + this.min_age
                + ",max_age:" + this.max_age + ",min_years_of_experience:" + this.min_years_of_experienc + "}";
    }

    public int getAge() {
        return this.age;
    }

    public String getProfession() {
        return this.profession;
    }

    public int getExperience_y() {
        return this.experience_y;
    }

    public Person(String full_name_tf, int age_tf, String id_tf, String profession_tf, int YOE_tf, Operation operation) {
        this.name = full_name_tf;
        this.age = age_tf;
        this.ID = id_tf;
        this.profession = profession_tf;
        this.experience_y = YOE_tf;
        this.operation = operation;
        ++this.personCounter;
    }

    public int getPersonCounter() {
        return personCounter;
    }

    public void setPersonCounter(int personCounter) {
        this.personCounter = personCounter;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setExperience_y(int experience_y) {
        this.experience_y = experience_y;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }

    public int getMin_years_of_experienc() {
        return min_years_of_experienc;
    }

    public void setMin_years_of_experienc(int min_years_of_experienc) {
        this.min_years_of_experienc = min_years_of_experienc;
    }
}

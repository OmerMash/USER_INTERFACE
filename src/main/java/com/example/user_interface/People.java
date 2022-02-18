package com.example.user_interface;

public class People {
    private String name;
    private String profession;
    private int age;
    private int experience_years;
    private long ID;

    public People(String name, String profession, int age, int experience_years, long ID) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.experience_years = experience_years;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public int getExperience_years() {
        return experience_years;
    }

    public long getID() {
        return ID;
    }
}

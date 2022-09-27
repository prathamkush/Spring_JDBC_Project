package com.spring.boot.jdbc.SpringBootJDBC;

import java.util.Date;


public class Player {
    private int ID;
    private String name;
    private int age;
    private String nationality;
    private Date dob;
    private int designation;

    public Player(){}

    public Player(int ID, String name, int age, String nationality, Date dob, int designation) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.dob = dob;
        this.designation = designation;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", dob=" + dob +
                ", designation=" + designation +
                '}';
    }
}

package com.spring.boot.jdbc.SpringBootJDBC.Entity;

import javax.persistence.*;
import java.util.Date;


@Entity                // Rowmapping (create database/schema)
@NamedQuery(name="get_all_players", query = "SELECT p FROM Player p")
@Table(name="Player") //give the table name
public class Player {

    @Id
    //@GeneratedValue
    @Column(name="ID")
    private int ID;//auto generate id value on new row insertion

    @Column(name="Name")
    private String name;

    @Column(name="Age")
    private int age;

    @Column(name="Nationality")
    private String nationality;

    @Column(name="DOB")
    private Date dob;

    @Column(name="Designation")
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

    public Player(String name, int age, String nationality, Date dob, int designation) {
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

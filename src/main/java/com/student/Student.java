package com.student;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private  String name;
    @Column(name = "class")
    private  String className;
    @Column(name = "roll")
    private Integer roll;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Shakiba
 */
@Entity
public class Student {
   @Id
    private int id;
    private String name;
    private String department;
    private String note;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", department=" + department + '}';
    }
    
}

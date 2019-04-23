/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernet.main;

import com.hibernet.dao.FactoryDao;
import com.hibernet.model.Student;

/**
 *
 * @author Shakiba
 */
public class Main {
    public FactoryDao fDao;
    public static void main(String[] args)
    {
        Student student=new Student(101,"Shakiba","CSE");
        new Main().insetStudent(student);
    }
    public void insetStudent(Student student)
    {
        if(fDao==null)
        {
            fDao=new FactoryDao();
        }
        fDao.insertValue(student);
    }
}

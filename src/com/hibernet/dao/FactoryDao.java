/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernet.dao;

import com.hibernet.factory.HibernetSession;
import com.hibernet.model.Student;
import org.hibernate.Session;

/**
 *
 * @author Shakiba
 */
public class FactoryDao {
    public void insertValue(Student student)
    {
        Session session = new HibernetSession().getSession();
        //String hql = "FROM parlor WHERE " + columnName + " = '" + columnValue + "'";
        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
}

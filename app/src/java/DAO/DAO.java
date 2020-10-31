/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controller.UserController;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mariomthree
 */
public class DAO {

    private  Session session = null;
    private  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public  void create(Object o) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(o);
            transaction.commit();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
    }

    public  void update(Object o) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(o);
            transaction.commit();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
    }

    public  void delete(Object o) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(o);
            transaction.commit();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
    }

    public  <T> List<T> read(Class<T> c) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(c);
            transaction.commit();
            return criteria.list();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        return null;
    }

    public  <T> Object findById(Class<T> c, long id) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(c);
            criteria.add(Restrictions.eq("id", id));
            transaction.commit();
            return criteria.uniqueResult();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        return null;
    }
    
}

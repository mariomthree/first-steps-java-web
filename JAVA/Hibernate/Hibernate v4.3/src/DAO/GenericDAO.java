/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * class GenericDAO - Classe generica para os dados de acesso a objecto, contem
 * os metodos basicos de criacao, remocao, actualizacao, e exclusao.
 *
 * @author MarioM3
 */
public class GenericDAO {

    Session session = null;
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    /**
     * Métodos create - Responsável por cadastrar um objecto na base de dados.
     *
     * @param o - Objecto a cadastrar na base de dados.
     */
    public void create(Object o) {
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

    /**
     * Métodos read - Responsável por retornar todos os objectos cadastrados na
     * base de dados.
     *
     * @param <T> - Tipo de Dado generico.
     * @param c - Class conrrespondete aos objectos que pretende observar os
     * dados.
     * @return - Rotorna todos os dados cadastrados.
     */
    public <T> List<T> read(Class<T> c) {
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

    /**
     * Métodos remove - Responsável por remover um objecto na base de dados.
     *
     * @param o - Objecto a remover na base de dados.
     */
    public void update(Object o) {
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

    /**
     * Métodos delete - Responsável por remover um objecto na base de dados.
     *
     * @param o - Objecto a remover na base de dados.
     */
    public void delete(Object o) {
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

    /**
     * Métodos findById - Pesquisa na base de dados tendo como chave o codigo do
     * objecto.
     *
     * @param <T> - Tipo de Dado generico.
     * @param c - Class conrrespondete aos objectos que pretende observar os
     * dados.
     * @param id - id do objecto
     * @return - retorna o objecto especificado.
     */
    public <T> Object findById(Class<T> c, int id) {
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

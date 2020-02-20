/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
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
            if (session != null) {
                session.close();
            }
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
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = builder.createQuery(c);
            criteriaQuery.from(c);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (HibernateException e) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    /**
     * Métodos update - Responsável por actualizar um objecto na base de dados.
     *
     * @param o - Objecto a actulizar na base de dados.
     */
    public void update(Object o) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(o);
            transaction.commit();
        } catch (HibernateException e) {
        } finally {
            if (session != null) {
                session.close();
            }
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
            if (session != null) {
                session.close();
            }
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
    public <T> List<T> findById(Class<T> c, Object id) {
        try {
            session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = builder.createQuery(c);
            Root<T> root = criteriaQuery.from(c);
            criteriaQuery.select(root);
            Predicate predicate = builder.equal(root.get("id"), id);
            criteriaQuery.where(predicate);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (HibernateException e) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    /**
     * Métodos findByColumn - Pesquisa na base de dados é especificado o
     * atributo(campo) que tera de referencia para comparacao.
     *
     * @param <T> - Tipo de Dado generico.
     * @param c - Class conrrespondete aos objectos que pretende observar os
     * dados.
     * @param id - id do objecto
     * @param column - campo que tera de refencia para a pesquisa
     * @return - retorna o objecto especificado.
     */
    public <T> List<T> findByColumn(Class<T> c, Object id, String colmun) {
        try {
            session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = builder.createQuery(c);
            Root<T> root = criteriaQuery.from(c);
            criteriaQuery.select(root);
            Predicate predicate = builder.equal(root.get(colmun), id);
            criteriaQuery.where(predicate);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (HibernateException e) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

}

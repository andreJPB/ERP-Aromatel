package br.com.aromatel.erp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author henriquevalcanaia
 */
public class DAO<T> {

    private final Class<T> classe;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public void adiciona(T t) {
        EntityManager em = getEntityManager();
        em.persist(t);
    }

    public void remove(T t) {
        EntityManager em = getEntityManager();
        em.remove(t);
    }

    public void atualiza(T t) {
        EntityManager em = getEntityManager();
        em.merge(t);
    }

    public List<T> listaTodos() {
        EntityManager em = getEntityManager();
        CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
        query.select(query.from(classe));

        List<T> lista = em.createQuery(query).getResultList();

        return lista;
    }

    public T buscaPorId(Long id) {
        EntityManager em = getEntityManager();
        T instancia = em.find(classe, id);
        return instancia;
    }

    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ERPPU");
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("ERPPU");
        }
        return factory.createEntityManager();
    }

}

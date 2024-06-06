package com.system.client.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.system.client.dao.PhoneDAO;
import com.system.client.models.PhoneDTO;


public class PhoneDAOImpl implements PhoneDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");

    @Override
    public void savePhone(PhoneDTO phone) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phone);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<PhoneDTO> getAllPhones() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT p FROM PhoneDTO p");
        List<PhoneDTO> phones = query.getResultList();
        em.close();
        return phones;
    }

    @Override
    public PhoneDTO getPhoneById(Long id) {
        EntityManager em = emf.createEntityManager();
        PhoneDTO phone = em.find(PhoneDTO.class, id);
        em.close();
        return phone;
    }

    @Override
    public void updatePhone(PhoneDTO phone) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(phone);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deletePhone(PhoneDTO phone) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(phone) ? phone : em.merge(phone));
        em.getTransaction().commit();
        em.close();
    }
}

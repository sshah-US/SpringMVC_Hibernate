package com.ss.breg.dao;

import com.ss.breg.model.AllInfo;
import com.ss.breg.exception.ApplicationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AllInfoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public boolean save(AllInfo aInfo) throws ApplicationException {
        try {
            getSession().persist(aInfo);
            // id will be generated on flush/commit; persist is OK inside transaction
            return true;
        } catch (Exception e) {
            throw new ApplicationException("Error saving data", e);
        }
    }

    public AllInfo findById(Long id) throws ApplicationException {
        try {
            return getSession().get(AllInfo.class, id);
        } catch (Exception e) {
            throw new ApplicationException("Error fetching record", e);
        }
    }

    public List<AllInfo> findAll() throws ApplicationException {
        try {
            return getSession().createQuery("from AllInfo", AllInfo.class).list();
        } catch (Exception e) {
            throw new ApplicationException("Error fetching all records", e);
        }
    }

    public void update(AllInfo aInfo) throws ApplicationException {
        try {
            getSession().merge(aInfo);
        } catch (Exception e) {
            throw new ApplicationException("Error updating data", e);
        }
    }

    public void delete(Long id) throws ApplicationException {
        try {
            AllInfo entity = getSession().get(AllInfo.class, id);
            if (entity != null) {
                getSession().remove(entity);
            }
        } catch (Exception e) {
            throw new ApplicationException("Error deleting data", e);
        }
    }
}

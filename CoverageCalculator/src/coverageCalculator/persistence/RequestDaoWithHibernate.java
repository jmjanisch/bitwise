package coverageCalculator.persistence;

import coverageCalculator.RequestEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justin Janisch on 3/26/2016.
 */
public class RequestDaoWithHibernate {

    private final Logger log = Logger.getLogger(this.getClass());

    public List<RequestEntity> getAllRequests() {
        List<RequestEntity> allRequests = new ArrayList<RequestEntity>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.createCriteria(RequestEntity.class).list();
        return allRequests;
    }

    public void updateRequest(RequestEntity requestEntity) {

    }


    public void deleteRequest(RequestEntity requestEntity) {

    }


    public int addRequest(RequestEntity requestEntity) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer requestId = null;

        try {
            transaction = session.beginTransaction();
            requestId = (Integer) session.save(requestEntity);

            session.save(requestEntity);
            transaction.commit();

            log.info("Added Request: " + requestEntity + " with id of: " + requestId);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);

        } finally {
            session.close();
        }
        return requestId;
    }

}

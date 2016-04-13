package java.coverageCalculator.persistence;

/**
 * Created by Justin Janisch on 3/26/2016.

public class RequestDaoWithHibernate {

    private final Logger log = Logger.getLogger(this.getClass());

    public List<RequestEntity> getAllRequests() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<RequestEntity> allHolidayRequests = new ArrayList<RequestEntity>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List requestsInDB = session.createQuery("FROM RequestEntity").list();

            for (Iterator iterator = requestsInDB.iterator(); iterator.hasNext();) {

                RequestEntity holidayRequest = (RequestEntity) iterator.next();
                allHolidayRequests.add(holidayRequest);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of holiday requests: " + allHolidayRequests.size());

        return allHolidayRequests;
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
*/
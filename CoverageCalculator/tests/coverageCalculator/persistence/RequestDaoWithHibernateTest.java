package coverageCalculator.persistence;

import coverageCalculator.RequestEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 3/26/2016.
 */
public class RequestDaoWithHibernateTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetAllRequests() throws Exception {
        RequestDaoWithHibernate dao = new RequestDaoWithHibernate();

        List<RequestEntity> allRequests = new ArrayList<RequestEntity>();

        allRequests = dao.getAllRequests();
        System.out.println("All Requests: " + allRequests);
        assertTrue(allRequests.size() > 0);
    }

    @Test
    public void testUpdateRequest() throws Exception {

    }

    @Test
    public void testDeleteRequest() throws Exception {

    }

    @Test
    public void testAddRequest() throws Exception {

    }
}
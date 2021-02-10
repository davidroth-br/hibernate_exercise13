package data;

import entities.Locations;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;
import java.util.List;

public class LocationServices implements LocationsDAO{

    private Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Locations> getAllLocations() {
        Query<Locations> query = session.createQuery("FROM Locations");
        return query.list();
    }

    @Override
    public Locations getLocationsById(Integer locationId) {
        Query<Locations> query = session.createQuery("FROM Locations WHERE locationId=:id");
        query.setParameter("id", locationId);
        return query.uniqueResult();
    }

    @Override
    public List<Locations> getLocationsFirstPage(int pageSize) {
        Query<Locations> query = session.createQuery("FROM Locations");
        query.setMaxResults(pageSize);
        return query.list();
    }

    @Override
    public void saveLocation(Locations loc) {
        session.beginTransaction();
        session.save(loc);
        session.getTransaction().commit();
    }
}

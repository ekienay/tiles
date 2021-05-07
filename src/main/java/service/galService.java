package service;

import dao.DAO;
import model.Gal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class galService implements DAO<Gal> {

    private final SessionFactory factory;

    public galService(SessionFactory factory) {
        this.factory = factory;
    }

    public void create(Gal gal) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(gal);
            session.getTransaction().commit();
        }
    }

    public void update(Gal gal) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(gal);
            session.getTransaction().commit();
        }
    }

    public void delete(Gal gal) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(gal);
            session.getTransaction().commit();
        }
    }
    @SuppressWarnings("unchecked")
    public List<Gal> read() {
        try(Session session = factory.openSession()){
            Query<Gal> query = session.createQuery("from Gal");
            return query.list();
        }

    }
}

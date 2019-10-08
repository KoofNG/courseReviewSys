package coursereviewsystem;

import coursereviewsystem.configurations.HibernateConfig;
import coursereviewsystem.models.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        Instructor instructor = new Instructor("Yaa", "Yoo", 28);
//        Integer id = (Integer) session.save(instructor);
//        System.out.println(" id :: " + id);
//        tx.commit();
//        session.close();


//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        Instructor instructor = new Instructor("Yaa", "Yoo", 28);
//        Integer id = (Integer) session.save(instructor);
//
//        System.out.println(" id :: " + id);
//        tx.commit();
//
//        session.close();

    }
}

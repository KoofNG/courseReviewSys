package coursereviewsystem;

import coursereviewsystem.configurations.HibernateConfig;
import coursereviewsystem.models.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Instructor instructor = new Instructor("Yaa", "Yoo", 28);
        session.persist(instructor);

        //  Integer id = (Integer) session.save(instructor);
//        session.getTransaction().commit();
        System.out.println(" id :: " +instructor);
    }
}

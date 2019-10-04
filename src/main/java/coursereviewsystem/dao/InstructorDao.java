package coursereviewsystem.dao;

import coursereviewsystem.configurations.HibernateConfig;
import coursereviewsystem.models.Instructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InstructorDao {

    public void saveInstructor(Instructor instructor) {
        Transaction transaction = null;

        try {
            Session session = HibernateConfig.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            System.out.println("Before session saves");
            session.save(instructor);
            System.out.println("Before sessions commit transactions");
            session.getTransaction().commit();
            System.out.println("Before session closes");
//            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

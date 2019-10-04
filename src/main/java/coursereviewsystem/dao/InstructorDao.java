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
            session.save(instructor);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

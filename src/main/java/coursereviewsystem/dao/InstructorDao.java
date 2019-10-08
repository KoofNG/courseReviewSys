package coursereviewsystem.dao;

import coursereviewsystem.configurations.HibernateConfig;
import coursereviewsystem.models.Instructor;
import coursereviewsystem.models.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InstructorDao {

    public void saveInstructor(InstructorDetails instructorDetails) {
        Transaction transaction = null;

        try {
            Session session = HibernateConfig.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(instructorDetails);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

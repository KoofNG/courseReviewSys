package coursereviewsystem.dao;

import coursereviewsystem.configurations.HibernateConfig;
import coursereviewsystem.models.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {

    public void saveStudent(Student student) {
        Transaction transaction = null;

        try {
            Session session = HibernateConfig.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

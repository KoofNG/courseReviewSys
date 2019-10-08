package coursereviewsystem.configurations;

import coursereviewsystem.models.Instructor;
import coursereviewsystem.models.InstructorDetails;
import coursereviewsystem.models.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfig {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/courseReviewSystem?useSSL=false&serverTimezone=UTC");
                settings.put(Environment.USER, "koofng");
                settings.put(Environment.PASS, "passQ2k18#");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
                settings.put(Environment.POOL_SIZE, 5);
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.SHOW_SQL, "true");
                configuration.setProperties(settings);


                // Add annotation for all entity here
                // configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Instructor.class);
                configuration.addAnnotatedClass(InstructorDetails.class);
                configuration.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}

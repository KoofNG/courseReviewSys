package coursereviewsystem.models;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "instructor")
public class Instructor{

        @Id
        @GeneratedValue(generator="increment")
        @GenericGenerator(name="increment", strategy = "increment")
        private int id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "age")
        private int age;

        @OneToOne(mappedBy = "instructor")
        private InstructorDetails instructorDetails;

        public Instructor() { }

        public Instructor(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        // Setters

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return id + " " + firstName + " " + lastName + " " + age + " || ";
        }
}


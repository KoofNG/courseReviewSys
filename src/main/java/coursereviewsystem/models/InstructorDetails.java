package coursereviewsystem.models;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "instructorDetails")
public class InstructorDetails{
    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructorID")
    private Instructor instructor;

    private String hobbies;

    public InstructorDetails() {
    }

    public InstructorDetails(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public Instructor getInstructorID() {
        return instructor;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return " " + id + " " + " " + hobbies;
    }
}

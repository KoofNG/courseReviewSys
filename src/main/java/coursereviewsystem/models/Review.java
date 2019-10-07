package coursereviewsystem.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    private int id;

    @Column(name = "courseID")
    private int courseId;

    @Column(name = "studentID")
    private int studentID;

    @Column(name = "comment")
    private String comment;
}

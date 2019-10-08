package coursereviewsystem.controllers;

import coursereviewsystem.dao.InstructorDao;
import coursereviewsystem.models.Instructor;
import coursereviewsystem.models.InstructorDetails;
import coursereviewsystem.models.InstructorForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InstructorController {

    @RequestMapping(value = "/saveInstructor",method = RequestMethod.POST)
    public String saveInstructor(InstructorForm instructorForm) {
        InstructorDao instructorDao = new InstructorDao();
        Instructor instructor = instructorForm.getInstructor();
        InstructorDetails instructorDetails = instructorForm.getInstructorDetails();
        if (instructor.getFirstName().length() != 0 && instructor.getLastName().length() != 0 && instructor.getAge() != 0){
            try {
                instructorDetails.setInstructor(instructor);
                System.out.println(instructorDetails + " " + instructor);
                instructorDao.saveInstructor(instructorDetails);
                return "index";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "instructor-registration-form";
    }
}

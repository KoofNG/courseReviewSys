package coursereviewsystem.controllers;

import coursereviewsystem.dao.InstructorDao;
import coursereviewsystem.models.Instructor;
import coursereviewsystem.models.InstructorDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InstructorController {

    @RequestMapping(value = "/saveInstructor",method = RequestMethod.POST)
//    public String saveInstructor(@ModelAttribute("instructorModel")Instructor instructor, Model model)
    public String saveInstructor(Instructor instructor, InstructorDetails instructorDetails, Model model) {
        InstructorDao instructorDao = new InstructorDao();
        model.addAttribute("instructorModel", instructor);
        model.addAttribute("instructorDetails", instructorDetails);
        if (instructor.getFirstName().length() != 0 && instructor.getLastName().length() != 0 && instructor.getAge() != 0){
            try {
//                instructor.setInstructorDetails(instructorDetails);
                instructorDetails.setInstructor(instructor);
                instructorDao.saveInstructor(instructor);
                return "index";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "instructor-registration-form";
    }
}

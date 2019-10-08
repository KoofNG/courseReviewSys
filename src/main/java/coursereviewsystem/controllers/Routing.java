package coursereviewsystem.controllers;

import coursereviewsystem.dao.InstructorDao;
import coursereviewsystem.models.Instructor;
import coursereviewsystem.models.InstructorDetails;
import coursereviewsystem.models.InstructorForm;
import coursereviewsystem.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Routing {

    @RequestMapping("/")
    public String loadIndexPage(){
        InstructorDao instructorDao = new InstructorDao();
        Instructor instructor = new Instructor("Musa", "Yaradua", 33);
//        instructorDao.saveInstructor(instructor);
        return "index";
    }

    @RequestMapping(value = "/register-course", method = RequestMethod.GET)
    public String registerCourse() {
        return "create-course-form";
    }

    @RequestMapping(value = "/update-course", method = RequestMethod.GET)
    public String updateCourse() {
        return "update-course-details";
    }

    @RequestMapping(value = "/register-student", method = RequestMethod.GET)
    public String registerStudent(Model model) {
        Student student = new Student();
        model.addAttribute("studentModel", student);
        return "create-student";
    }

    @RequestMapping(value = "/register-instructor", method = RequestMethod.GET)
    public String registerInstructor(ModelMap model) {
        InstructorForm instructorForm = new InstructorForm();
//        Instructor instructor = new Instructor();
//        InstructorDetails instructorDetails = new InstructorDetails();

        model.addAttribute("instructorFormModel", instructorForm);
        return "instructor-registration-form";
    }


}

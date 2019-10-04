package coursereviewsystem.controllers;

import coursereviewsystem.dao.InstructorDao;
import coursereviewsystem.models.Instructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Routing {

    @RequestMapping("/index-now")
    public String loadIndexPage(){
        InstructorDao instructorDao = new InstructorDao();
        Instructor instructor = new Instructor("Musa", "Yaradua", 33);
        instructorDao.saveInstructor(instructor);
        return "page";
    }
}

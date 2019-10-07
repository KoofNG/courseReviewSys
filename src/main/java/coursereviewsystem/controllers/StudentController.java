package coursereviewsystem.controllers;

import coursereviewsystem.dao.InstructorDao;
import coursereviewsystem.dao.StudentDao;
import coursereviewsystem.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student, ModelMap model) {
//        Student student = new Student();
//        StudentDao studentDao = new StudentDao();
//        studentDao.saveStudent(student);

        model.addAttribute("studentModel", student);

        System.out.println(student);


        return "index";
    }
}

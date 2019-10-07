package coursereviewsystem.controllers;

import coursereviewsystem.dao.StudentDao;
import coursereviewsystem.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student, ModelMap model) {
        StudentDao studentDao = new StudentDao();
        model.addAttribute("studentModel", student);

        if (student.getFirstName().length() != 0 && student.getLastName().length() != 0 && student.getAge() != 0 ) {
            try {
                studentDao.saveStudent(student);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "index";
        } else {
            return "create-student";
        }
    }
}

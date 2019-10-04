package coursereviewsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Routing {

    @RequestMapping("/index-now")
    public String loadIndexPage(){
        return "page";
    }
}

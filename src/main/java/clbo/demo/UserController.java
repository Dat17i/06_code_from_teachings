package clbo.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {

        UserRepository ur = new UserRepository();

        System.out.println();

        return "index";
    }
}
package lt.nfq.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginForm() {
        return "conferencelist";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login() {
//        return "loginma";
//    }
    
    @RequestMapping(value = "/registerform", method = RequestMethod.GET)
    public String register() {
        return "registerform";
    }
    
    @RequestMapping(value = "/registerform", method = RequestMethod.POST)
    public String registerForm() {
        return "registerform";
    }
}

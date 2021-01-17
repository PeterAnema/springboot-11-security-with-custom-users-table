package nl.gettoworktogether.security_with_custom_users_table.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello World";
    }

}

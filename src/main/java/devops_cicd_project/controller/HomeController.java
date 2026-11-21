
package devops_cicd_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "DevOps CI/CD Project - Application Running Successfully!!!!!";
    }
}

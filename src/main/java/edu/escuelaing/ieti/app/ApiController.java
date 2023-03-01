package edu.escuelaing.ieti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String getStatus(){
        return "Juan Diego Becerra Peña";
    }
}

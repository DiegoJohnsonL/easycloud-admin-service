package pe.edu.upc.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "hello world";
    }
}

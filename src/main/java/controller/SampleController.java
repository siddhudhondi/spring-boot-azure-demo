package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    private String sayHello()
    {
        return "Say Hello";
    }

    @GetMapping("/healthCheck")
    private String sayHealthCheck()
    {
        return "Return Hello Message";
    }


}

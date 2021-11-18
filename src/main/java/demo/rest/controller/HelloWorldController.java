package demo.rest.controller;

import demo.rest.domain.Message;
import demo.rest.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/hello")
    public String hello(@RequestBody Message message) {
        return String.format("Hello %s!", message.getText());

    }

}

package demo.rest.domain;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Message {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody Message message) {
        return String.format("Hello %s!", message.getText());
    }

}

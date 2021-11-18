package demo.rest.service.impl;

import demo.rest.domain.Message;
import demo.rest.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String createMessage(Message message) {
        return String.format("Hello %s!", message.getText());
    }

}
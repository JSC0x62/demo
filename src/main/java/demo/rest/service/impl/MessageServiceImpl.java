package demo.rest.service.impl;

import demo.rest.domain.Message;
import demo.rest.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String createMessage(Message message) {
        return message.getText();
    }

}
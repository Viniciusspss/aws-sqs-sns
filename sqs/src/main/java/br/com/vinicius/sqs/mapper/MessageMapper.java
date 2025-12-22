package br.com.vinicius.sqs.mapper;

import br.com.vinicius.sqs.entity.Message;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MessageMapper {
    public static Message toEntity(String message) {
        Message entity = new Message();
        entity.setMessage(message);
        entity.setId(UUID.randomUUID().toString());
        return entity;
    }
}

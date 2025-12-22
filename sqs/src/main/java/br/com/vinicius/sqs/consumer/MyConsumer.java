package br.com.vinicius.sqs.consumer;

import br.com.vinicius.sqs.entity.Message;
import io.awspring.cloud.dynamodb.DynamoDbTemplate;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static br.com.vinicius.sqs.mapper.MessageMapper.toEntity;

@Component
public class MyConsumer {

    @Autowired
    private DynamoDbTemplate dynamoDbTemplate;

    @SqsListener("minha-fila")
    public void listen(String message){
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Erro ao tentar salvar a mensagem");
        }

        dynamoDbTemplate.save(toEntity(message));

        System.out.println("Message received: " + message);
    }
}

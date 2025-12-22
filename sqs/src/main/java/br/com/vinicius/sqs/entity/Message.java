package br.com.vinicius.sqs.entity;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@DynamoDbBean
public class Message {
    private String message;
    private String id;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @DynamoDbSortKey
    @DynamoDbAttribute("message_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

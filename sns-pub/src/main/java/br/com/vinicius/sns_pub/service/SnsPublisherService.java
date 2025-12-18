package br.com.vinicius.sns_pub.service;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@Service
public class SnsPublisherService {

    private final SnsClient snsClient;

    public SnsPublisherService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public void publish(String message) {
        snsClient.publish(PublishRequest.builder()
                .message(message)
                .topicArn("arn:aws:sns:sa-east-1:000000000000:send-message_notification")
                .build());
    }
}

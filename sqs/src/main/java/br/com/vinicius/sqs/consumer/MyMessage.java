package br.com.vinicius.sqs.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MyMessage(@JsonProperty("Message")
                         String message) {
}

package br.com.vinicius.sns_pub.controller;

import br.com.vinicius.sns_pub.controller.request.PublishRequest;
import br.com.vinicius.sns_pub.service.SnsPublisherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class PublishController {

    private final SnsPublisherService snsPublisherService;

    public PublishController(SnsPublisherService snsPublisherService) {
        this.snsPublisherService = snsPublisherService;
    }

    @PostMapping
    public void publish(@RequestBody PublishRequest publishRequest) {
        snsPublisherService.publish(publishRequest.content());
    }
}

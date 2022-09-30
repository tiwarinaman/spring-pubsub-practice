package com.techinaman.springpubsubpractice.controller;

import com.techinaman.springpubsubpractice.service.PubSubPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    private final PubSubPublisher operation;

    public PublisherController(PubSubPublisher operation) {
        this.operation = operation;
    }

    @PostMapping("/publishSuccess")
    public String publishSuccessMessage(@RequestBody String msg) {
        operation.publishSuccessEvent(msg);
        return "Message successfully published";
    }

    @PostMapping("/publishError")
    public String publishErrorMessage(@RequestBody String msg) {
        operation.publishFailedEvent(msg);
        return "Message successfully published";
    }

}

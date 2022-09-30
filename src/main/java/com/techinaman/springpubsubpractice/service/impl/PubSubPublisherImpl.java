package com.techinaman.springpubsubpractice.service.impl;

import com.techinaman.springpubsubpractice.service.PubSubPublisher;
import org.springframework.cloud.gcp.pubsub.core.publisher.PubSubPublisherTemplate;
import org.springframework.stereotype.Service;

@Service
public class PubSubPublisherImpl implements PubSubPublisher {

    private final PubSubPublisherTemplate publisherTemplate;

    public PubSubPublisherImpl(PubSubPublisherTemplate publisherTemplate) {
        this.publisherTemplate = publisherTemplate;
    }

    @Override
    public void publishSuccessEvent(String message) {
        publisherTemplate.publish("topic-1", message);
    }

    @Override
    public void publishFailedEvent(String message) {
        publisherTemplate.publish("topic-2", message);
    }
}

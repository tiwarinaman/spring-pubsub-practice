package com.techinaman.springpubsubpractice.service;

public interface PubSubPublisher {
    void publishSuccessEvent(String message);

    void publishFailedEvent(String message);
}

package com.techinaman.springpubsubpractice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.integration.outbound.PubSubMessageHandler;
import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.cloud.gcp.pubsub.support.converter.PubSubMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.handler.annotation.Header;

@Configuration
public class PubSubConfig {

//    @Bean
//    public MessageChannel pubsubMetricsOutboundChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public PubSubMessageConverter pubSubMessageConverter() {
//        return new JacksonPubSubMessageConverter(new ObjectMapper());
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel = "pubsubMetricsOutboundChannel")
//    public MessageHandler messageSender(PubSubTemplate pubsubTemplate) {
//        return new PubSubMessageHandler(pubsubTemplate, "topic-1");
//    }
//
//    @MessagingGateway(defaultRequestChannel = "pubsubMetricsOutboundChannel")
//    public interface PubsubOutboundGateway {
//
//        void sendToPubsub(@Header(GcpPubSubHeaders.TOPIC) String topic, String text);
//    }
}

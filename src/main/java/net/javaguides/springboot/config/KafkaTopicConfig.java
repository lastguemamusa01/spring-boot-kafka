package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Bean
  public NewTopic javaguidesTopic() {
    return TopicBuilder.name("javaguides").build();
      //.partitions(10).build(); // 10 partitions divided in this topic
  }

}
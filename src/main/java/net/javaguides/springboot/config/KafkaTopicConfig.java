package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Value("${spring.kafka.topic.name}")
  private String topicName;

  @Value("${spring.kafka.topic.-json.name}")
  private String topicJsonName;
  @Bean
  public NewTopic javaguidesTopic() {
    return TopicBuilder.name(topicName).build();
      //.partitions(10).build(); // 10 partitions divided in this topic
  }

  @Bean
  public NewTopic javaguidesJsonTopic() {
    return TopicBuilder.name(topicJsonName).build();
    //.partitions(10).build(); // 10 partitions divided in this topic
  }

}

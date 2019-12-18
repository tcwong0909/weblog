package com.tcwong.mongodb.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MongoTemplateConfig {

    @Primary
    @Bean("firstMongoProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.first")
    public MongoProperties firstMongoProperties() {
        return new MongoProperties();
    }

    @Bean("secondMongoProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.second")
    public MongoProperties secondMongoProperties() {
        return new MongoProperties();
    }

    @Primary
    @Bean(value = "firstMongoTemplate")
    public MongoTemplate firstMongoTemplate(@Qualifier("firstMongoProperties") MongoProperties mongoProperties) {
        return new MongoTemplate(mongoDbFactory(mongoProperties));
    }

    @Bean(value = "secondMongoTemplate")
    public MongoTemplate secondMongoTemplate(@Qualifier("secondMongoProperties") MongoProperties mongoProperties) {
        return new MongoTemplate(mongoDbFactory(mongoProperties));
    }


    private MongoDbFactory mongoDbFactory(MongoProperties mongoProperties) {
        ServerAddress serverAddress = new ServerAddress(mongoProperties.getHost(), mongoProperties.getPort());
        List<MongoCredential> credentialList = new ArrayList<>();
        credentialList.add(MongoCredential.createScramSha1Credential(mongoProperties.getUsername()
                , mongoProperties.getDatabase(), mongoProperties.getPassword()));
        MongoClient mongoClient = new MongoClient(serverAddress,
                credentialList,
                new MongoClientOptions.Builder().build());
        return new SimpleMongoDbFactory(mongoClient, mongoProperties.getDatabase());
    }
}

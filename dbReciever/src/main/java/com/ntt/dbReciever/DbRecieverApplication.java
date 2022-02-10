package com.ntt.dbReciever;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class DbRecieverApplication extends AbstractReactiveMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(DbRecieverApplication.class, args);
		
	}

	@Bean
	public MongoClient mongoClient() {
		return MongoClients.create();
	}

	@Override
	protected String getDatabaseName() {
		return "reactive";
	}

}

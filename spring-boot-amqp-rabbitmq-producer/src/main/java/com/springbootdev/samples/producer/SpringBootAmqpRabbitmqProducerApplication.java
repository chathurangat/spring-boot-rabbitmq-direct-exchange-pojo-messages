package com.springbootdev.samples.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootAmqpRabbitmqProducerApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAmqpRabbitmqProducerApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootAmqpRabbitmqProducerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception
    {
        LOGGER.info("application is up and running");
    }
}

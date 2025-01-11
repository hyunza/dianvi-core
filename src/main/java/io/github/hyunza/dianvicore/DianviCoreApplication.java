package io.github.hyunza.dianvicore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DianviCoreApplication {
    private static Logger logger = LoggerFactory.getLogger(DianviCoreApplication.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(DianviCoreApplication.class);
        springApplication.run(args);
        logger.info("DianviCoreApplication started successfully");
    }
}

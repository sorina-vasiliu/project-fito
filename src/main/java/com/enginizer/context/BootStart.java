
package com.enginizer.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BootStart {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootStart.class, args);
    }
}

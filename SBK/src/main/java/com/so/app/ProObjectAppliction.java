package com.so.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tmax.proobject.runtime.ProObjectServletInitializer;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.tmax.proobject", "com.so"})
public class ProObjectAppliction extends ProObjectServletInitializer{

	public static void main(String[] args) {
        SpringApplication.run(ProObjectAppliction.class, args);
    }
}

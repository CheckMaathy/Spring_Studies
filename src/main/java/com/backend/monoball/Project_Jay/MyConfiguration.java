package com.backend.monoball.Project_Jay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {
//App Configuration Class

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Running Production Configuration");
        };
    }
}

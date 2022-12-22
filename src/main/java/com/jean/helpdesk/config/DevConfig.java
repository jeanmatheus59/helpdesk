package com.jean.helpdesk.config;

import com.jean.helpdesk.services.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Autowired
    private DbService dbService;
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String value;
    @Bean
    public boolean instanciaDb(){
            if(value.equals("create")){
            this.dbService.instanciaDb();
        }
        return false;
    }

}

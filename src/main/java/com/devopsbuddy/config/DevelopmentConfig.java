package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Deni86 on 14.11.2016..
 */
@Configuration
@Profile("dev")//Spring ce ovu klasu ucitati tek kada je aktivan profil dev.
@PropertySource("file:///${user.home}/StripeAccount/application-dev.txt")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }

}

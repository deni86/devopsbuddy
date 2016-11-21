package com.devopsbuddy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Deni86 on 17.11.2016..
 */

//Nasljedjujemo ovu klasu da preuzmemo njezine pstojece funkcionalnosti
@Configuration
@EnableWebSecurity//Da aktiviramo spring security za nasu web mvc aplik.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment env;

      /**Public URLs. Bice dostupni bez provjere*/
      private static final String[] PUBLIC_MATCHERS = {
              "/webjars/**",
              "/css/**",
              "/js/**",
              "/images/**",
              "/",
              "/about/**",
              "/contact/**",
               "/error/**/*",
              "/console/**",

      };
      @Override
      protected void configure (HttpSecurity http) throws Exception{

          List<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
          if (activeProfiles.contains("dev")){
              http.csrf().disable();
              http.headers().frameOptions().disable();
          }

          http
                  .authorizeRequests()
                  .antMatchers(PUBLIC_MATCHERS).permitAll()
                  .and()
                  .formLogin().loginPage("/login").defaultSuccessUrl("/payload")
                  .failureUrl("/login?error").permitAll()
                  .and()
                  .logout().permitAll();

        }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
              .inMemoryAuthentication()
              .withUser("user").password("password")
              .roles("USER");
        }


}

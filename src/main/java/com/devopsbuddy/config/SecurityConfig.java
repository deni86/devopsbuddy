package com.devopsbuddy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Deni86 on 17.11.2016..
 */

//Nasljedjujemo ovu klasu da preuzmemo njezine pstojece funkcionalnosti
@Configuration
@EnableWebSecurity//Da aktiviramo spring security za nasu web mvc aplik.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

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

      };
      @Override
      protected void configure (HttpSecurity http) throws Exception{
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

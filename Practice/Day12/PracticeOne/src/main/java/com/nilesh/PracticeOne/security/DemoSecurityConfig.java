package com.nilesh.PracticeOne.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    // add support for JDBC ... no more hardcoded users :-
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource)
    {
        return new JdbcUserDetailsManager(dataSource);
    }



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(

                configurer ->
                        configurer
                                .requestMatchers(HttpMethod.GET, "/employees").hasRole("EMPLOYEE")
                                .requestMatchers(HttpMethod.GET, "/employees/**").hasRole("EMPLOYEE")
                                .requestMatchers(HttpMethod.POST, "/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.PUT, "/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.DELETE, "/employees/**").hasRole("ADMIN")


        );

        // use HTTP Basic authentication
        http.httpBasic();

        // disable Cross Site Request Forgery (CSRF)
        // in general, not required for stateless REST APIs that use POST, PUT, DELETE and/or PATCH

        http.csrf().disable();

        return http.build();
    }

    /*
    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails marry = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();


        return new InMemoryUserDetailsManager(john, marry, susan);
    }
*/

}

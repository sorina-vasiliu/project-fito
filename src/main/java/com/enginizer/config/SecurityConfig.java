package com.enginizer.config;

import com.enginizer.security.DatasourceAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home**").access("hasAnyRole('ADMINISTRATOR','CONSULTANT','CLIENT')")
                .and().formLogin().loginPage("/login").failureUrl("/login?loginError=true")
                .and().exceptionHandling().accessDeniedPage("/denied")
                .and().logout().logoutUrl("/logout").and().csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authBuilder) throws Exception {
        authBuilder.authenticationProvider(datasourceAuthenticationProvider());
    }

    @Bean
    public AuthenticationProvider datasourceAuthenticationProvider() {
        return new DatasourceAuthenticationProvider();
    }
}

package com.ibm.customerservicems.config;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		return http.authorizeHttpRequests(authorize-> authorize.requestMatchers("/h2-console/**").permitAll()
				.requestMatchers("/api/customer/**").hasAuthority("SCOPE_read").anyRequest().authenticated())
				.csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
				.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.sameOrigin()))
				.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())
				).build();
	}
	
	/*
	 * @Bean public JwtDecoder jwtDecoder() { return NimbusJwtDecoder.withSecretKey(
	 * new SecretKeySpec("your-256-bit-secret-key".getBytes(), "HmacSHA256")
	 * ).build(); }
	 */
	
}

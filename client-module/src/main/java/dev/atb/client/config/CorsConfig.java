package dev.atb.client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000","http://localhost:3001") // Replace with your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS") // Include HEAD and OPTIONS
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

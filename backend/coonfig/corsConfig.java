package com.ecommerce.perfume.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry){
        // React 개발 서버의 기본 포트인 3000번을 허용
        registry.addMapping("/**") // 모든 경로의 cors 허용
        .allowedOrigins("http://localhost:30000") // react 개발 서버 주소
        .allowedMethods("GET","POST","PUT","DELETE","OPTIONS") // 허용할 HTTP 메서드
        .allowCredentials(true); // 쿠키/인증 정보 전송 허용
    }
}
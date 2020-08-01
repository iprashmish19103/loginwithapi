package com.test.externalFundTransfer.Config;

import lombok.Value;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Configuration
@ComponentScan(basePackages = "com.test.externalFundTransfer")

public class RestTemplateConfig {
  @Bean
    public RestTemplate getTemplate()
  {
      return new RestTemplate();
  }
  @Bean
    public HttpHeaders getHeaders()
  {
      return new HttpHeaders();
  }



}

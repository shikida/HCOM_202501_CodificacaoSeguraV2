package br.com.ibm.hcom;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import jakarta.annotation.PostConstruct;

@EnableJpaAuditing
@SpringBootApplication
public class Application {

  private static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone("UTC");

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @PostConstruct
  public void postConstruct() {
    TimeZone.setDefault(DEFAULT_TIME_ZONE);
  }
}

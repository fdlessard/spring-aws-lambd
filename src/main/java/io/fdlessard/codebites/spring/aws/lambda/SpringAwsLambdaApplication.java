package io.fdlessard.codebites.spring.aws.lambda;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAwsLambdaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAwsLambdaApplication.class, args);
  }

  @Bean
  public Function<String, String> reverseString() {
    return value -> new StringBuilder(value).reverse().toString();
  }


}

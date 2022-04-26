package uz.pdp.springmicrodservicehodimlar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicrodserviceHodimlarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicrodserviceHodimlarApplication.class, args);
    }

}

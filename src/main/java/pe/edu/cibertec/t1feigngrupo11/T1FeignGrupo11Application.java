package pe.edu.cibertec.t1feigngrupo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo11Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo11Application.class, args);
    }

}

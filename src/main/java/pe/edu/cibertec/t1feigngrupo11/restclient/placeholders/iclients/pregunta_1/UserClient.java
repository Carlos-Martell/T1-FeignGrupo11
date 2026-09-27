package pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo11.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_1.UserPlaceHolder;

import java.util.List;

@FeignClient(name = "userClient",
        url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface UserClient {

    @GetMapping("/users")
    List<UserPlaceHolder> getUsers();
}

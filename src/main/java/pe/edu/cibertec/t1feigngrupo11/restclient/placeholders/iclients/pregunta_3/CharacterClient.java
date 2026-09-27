package pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.t1feigngrupo11.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_3.CharacterRM;

import java.util.List;

@FeignClient(name = "characterClient",
        url = "https://rickandmortyapi.com/api",
        configuration = FeignConfig.class)
public interface CharacterClient {

    @GetMapping("/character")
    CharacterRM getCharacters(@RequestParam String status, @RequestParam String species);
}

package pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_2;

import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_2.ProductStoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "productClient", url = "https://fakestoreapi.com")
public interface ProductClient {

    @GetMapping("/products")
    List<ProductStoreDto> getAllProducts();
}   
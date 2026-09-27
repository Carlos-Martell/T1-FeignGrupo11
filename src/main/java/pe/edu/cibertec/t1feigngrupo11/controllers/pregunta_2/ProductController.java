package pe.edu.cibertec.t1feigngrupo11.controllers.pregunta_2;

import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_2.ProductStoreDto;
import pe.edu.cibertec.t1feigngrupo11.services.pregunta_2.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/filter")
    public List<ProductStoreDto> getFilteredProducts() {
        return productService.getFilteredProducts();
    }
}
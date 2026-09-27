package pe.edu.cibertec.t1feigngrupo11.services.pregunta_2;

import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_2.ProductClient;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_2.ProductStoreDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductClient productClient;

    public ProductService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public List<ProductStoreDto> getFilteredProducts() {
        List<ProductStoreDto> allProducts = productClient.getAllProducts();

        return allProducts.stream()
                .filter(p -> p.getPrice() != null && p.getPrice() > 50.0)
                .filter(p -> "electronics".equalsIgnoreCase(p.getCategory()))
                .collect(Collectors.toList());
    }
}
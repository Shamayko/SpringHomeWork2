package EasyShop;

import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class InMemProductRepository {
    private List<Product> products;


    @PostConstruct
    public void init() {
/**
 * Товары хранятся в бине inMemProductRepository, в виде List<Product>,
 * при старте в него нужно добавить 5 любых товаров.
 */
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Personal Happiness", 100),
                new Product(2L, "Communism", 500),
                new Product(3L, "Immortality", 50),
                new Product(4L, "PS 5", 2),
                new Product(5L, "Time machine", 200)
        ));
    }

    /**
     * ProductRepository позволяет получить весь список или один товар по id.
     */
    public Product findSingleProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() ->
                new RuntimeException());
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

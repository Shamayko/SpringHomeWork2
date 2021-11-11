package EasyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private InMemProductRepository inMemProductRepository;

    @Autowired
    public void setProductRepository(InMemProductRepository productRepository) {
        this.inMemProductRepository = productRepository;
    }

    public Product getTitleById(Long id) {
        return inMemProductRepository.findSingleProductById(id);
    }
}


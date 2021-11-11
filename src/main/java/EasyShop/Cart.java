package EasyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
/**
 * При каждом запросе корзины из контекста, должна создаваться новая корзина.
 */
@Scope("prototype")
public class Cart {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    private List<Product> productsInCart;

    public Cart(List<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }

    /**
     * можно добавлять и удалять товары по id.
     */
    public void putProductToCartById(Long id) {
        productsInCart.add(orderService.createOrderFromProduct(id));
    }

    public void removeProductFromCartById(Long id) {
        productsInCart.remove(orderService.createOrderFromProduct(id));
    }

    @Override
    public String toString() {
        return "productList = " + productsInCart;
    }
}



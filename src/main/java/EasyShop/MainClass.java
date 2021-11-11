package EasyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class  MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("EasyShop");
        Cart cart = context.getBean(Cart.class);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            String[] splittedStr = str.split(" ");
            if (str.equals("/end")) {
                break;
            }
            if (str.startsWith("/show cart")) {
                System.out.println(cart);
            }
            if (str.startsWith("/put")) {
                System.out.println("Товар добавлен: ");
                cart.putProductToCartById(Long.parseLong(splittedStr[1]));
            }
            if (str.startsWith("/remove")) {
                System.out.println("Товар удален: ");
                cart.removeProductFromCartById(Long.parseLong(splittedStr[1]));
            }
        }
        context.close();
    }
}
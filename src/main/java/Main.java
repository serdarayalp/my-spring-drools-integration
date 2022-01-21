import de.mydomain.model.Product;
import de.mydomain.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("ProductService");

        Product product = new Product();
        product.setType("gold");

        productService.calculateDiscount(product);

        showDiscount(product);
    }

    private static void showDiscount(Product product) {
        System.out.println("The discount is " + product.getDiscount());
    }
}

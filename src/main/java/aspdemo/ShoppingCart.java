package aspdemo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //logging
        //Authentication and authorization
        //Sanitization
        System.out.println("Checkout method from shopping cart called");
    }
}

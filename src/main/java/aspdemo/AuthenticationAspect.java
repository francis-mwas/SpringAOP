package aspdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    /*
    * In point cut we define the class that we want to
    * execute for all methods available
    *
    * */
    @Pointcut("within(aspdemo..*)")
    public void authenticatingPointCut(){}

    /*
    * execute the point to to ShoppingCart class and all
    * the methods inside it
    * */
    @Pointcut("within(aspdemo.ShoppingCart.*)")
    public void authorizationPointCut(){}

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating and Authorizing the request the request");
    }
}

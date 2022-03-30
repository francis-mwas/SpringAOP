package aspdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //make this a spring component
public class LoggingAspect {

    /**
     * For system to understand that this is an aspect
     * We need to define a point cut
     * That can be used in the join point
     *
     * @Before, makes this method to be called before the join point
     * */
    @Before("execution(* aspdemo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Before logger");
    }
    /*
    * The first star is for any return type
    * The second star if for any package
    * The third star is for any class
    *
    * */
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}

package aspdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
    public void beforeLogger(JoinPoint joinPoint){
//        System.out.println(joinPoint.getSignature());
        String args = joinPoint.getArgs()[0].toString();
        System.out.println("Before logger with args: "+ args);
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

    @Pointcut("execution(* aspdemo.ShoppingCart.getQuantity(..))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()"
            ,returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: "+ retVal);
    }
}

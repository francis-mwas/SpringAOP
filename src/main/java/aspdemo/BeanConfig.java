package aspdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="aspdemo")
@EnableAspectJAutoProxy // enable aspect
public class BeanConfig{
}

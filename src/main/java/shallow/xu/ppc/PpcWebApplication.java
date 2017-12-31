package shallow.xu.ppc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})//无需数据库时
public class PpcWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpcWebApplication.class, args);
    }
}

package javamv.sysvar.verify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: VMoskalenko
 * Date: 17.07.12
 * Time: 23:51
 */
public class SharedContext {

    public static ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");

}

package maven.Example8;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("test.xml");
    	Registration r=(Registration)context.getBean("registration");
    	Address a=(Address)context.getBean("address");
    	Burger b=(Burger)context.getBean("burger");
    	System.out.println(r.toString());
    	System.out.println(a.toString());
    	System.out.println(b.toString());
    }
}

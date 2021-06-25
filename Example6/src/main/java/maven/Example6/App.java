package maven.Example6;


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
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        
        Burger b1 = (Burger) context.getBean("burger");
        b1.setBurgerName("BurgerKing");
        System.out.println(b1);
        
        Registration r1=(Registration) context.getBean("registration");
        r1.setFullname("Laxmi B M");
        r1.setEmailId("lbm@gmail.com");
        r1.setPhoneNumber(978565567);
        r1.setUsername("laxmi");
        r1.setPassword("456789");
        System.out.println(r1);
        
        Burger b2 = (Burger) context.getBean("burger");
        b1.setBurgerName("BurgerKing");
        System.out.println(b2);
        
        Registration r2=(Registration) context.getBean("registration");
        r1.setFullname("Nithin P");
        r1.setEmailId("np@gmail.com");
        r1.setPhoneNumber(978566757);
        r1.setUsername("nithin");
        r1.setPassword("987867");
        System.out.println(r2);
    }
}

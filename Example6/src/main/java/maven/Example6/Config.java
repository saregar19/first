package maven.Example6;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	@Bean(name="registration")
	@Scope("prototype")	//This scopes a single bean definition to have any number of object instances.
	public Registration registration() {
		return new Registration();
	}
	
	@Bean(name="address")
	public Address address() {
		return new Address();
	}
	
	@Bean(name="burger")
	@Scope("singleton")	//This scopes the bean definition to a single instance per Spring IoC container (default).
	public Burger burger() {
		return new Burger();
	}
	
	
}

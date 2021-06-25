package maven.Example6;

public class Burger {
	String burgerName;

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	
	@Override
	public String toString() {
		return "Burger Name: "+burgerName;
	}
}

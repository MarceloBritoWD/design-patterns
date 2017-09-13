
public class BuilderApp {
	
	public static void main(String[] args) {
		Pizza top = new Pizza.ChicagoBuilder(Dough.DOUGH_ONE, Sauce.SAUCE_ONE).hasCheese(Cheese.CHEESE_ONE);
	}

}

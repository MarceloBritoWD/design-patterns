package software_design.factoryMethod;


class PizzaStoreFM {
  public abstract class PizzaStore {

  	abstract Pizza createPizza(String item);

  	public Pizza orderPizza(String type) {
  		Pizza pizza = createPizza(type);
  		System.out.println("--- Making a " + pizza.getName() + " ---");
  		pizza.prepare();
  		pizza.bake();
  		pizza.cut();
  		pizza.box();
  		return pizza;
  	}
  }
  public class ChicagoPizzaStore extends PizzaStore {

  	Pizza createPizza(String item) {
			if (item.equals("cheese")) {
						return new ChicagoStyleCheesePizza();
			} else if (item.equals("veggie")) {
						return new ChicagoStyleVeggiePizza();
			} else if (item.equals("clam")) {
						return new ChicagoStyleClamPizza();
			} else if (item.equals("pepperoni")) {
						return new ChicagoStylePepperoniPizza();
			} else return null;
  	}
	}
	

 
}
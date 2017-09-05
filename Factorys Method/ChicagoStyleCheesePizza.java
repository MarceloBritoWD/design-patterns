public class ChicagoStyleCheesePizza implements Pizza {
  
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();

    
    public ChicagoStyleCheesePizza() {
  		name = "Chicago Style Deep Dish Cheese Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  	}

    @Override
  	public void cut() {
  		System.out.println("Cutting the pizza into square slices");
    }
    
    @Override
    public void prepare() {
      System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
          System.out.println("   " + topping);
        }	
    }

    @Override
    public void bake() {
      System.out.println("Bake for 25 minutes at 350");
    }

    @Override
    public void box() {
      System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String getName() {
      return name;
    }
  }
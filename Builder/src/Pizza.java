

public final class Pizza {
	private final Clams clams;
	private final Cheese cheese;
	private final Sauce sauce;
	private final Dough dough;
	private final Pepperoni pepperoni;
	
	public Pizza(ChicagoBuilder builder) {
		this.clams = builder.clams;
		this.cheese = builder.cheese;
		this.sauce = builder.sauce;
		this.dough = builder.dough;
		this.pepperoni = builder.pepperoni;
	}
	

}

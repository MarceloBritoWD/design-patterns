
public class ChicagoBuilder {
		public Clams clams;
		public Cheese cheese;
		public Sauce sauce;
		public Dough dough;
		public Pepperoni pepperoni;
		
		
		public ChicagoBuilder(Dough dough, Sauce sauce) {
			if (dough == null || sauce == null) {
				throw new IllegalArgumentException("Dough must be presented");
			}
			
			this.dough = dough;
			this.sauce = sauce;
		}
		
		public ChicagoBuilder hasClams(Clams clams) {
			this.clams = clams;
			return this;
		}
		
		public ChicagoBuilder hasCheese(Cheese cheese) {
			this.cheese = cheese;
			return this;
		}
		
		
		public ChicagoBuilder hasPepperoni(Pepperoni pepperoni) {
			this.pepperoni = pepperoni;
			return this;
		}
		
		
		public Pizza build() {
			return new Pizza(this);
		}
		
	}
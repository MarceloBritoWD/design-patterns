
public class FabricaDeFiltros {
	
	public FilterOp gotham() {
		FilterOp f = new Modulate(120, 10, 100);
		f.nextOp(new Fill("#222b6d"))
			.nextOp(new Colorize(20))
			.nextOp(new Gamma(20))
			.nextOp(new Contrast(20));		
		
		return f;	
	}
	
	public FilterOp sky() {
		FilterOp f = new Modulate(12, 210, 82);
		f.nextOp(new Fill("#120A8F"))
			.nextOp(new Colorize(40))
			.nextOp(new Gamma(50))
			.nextOp(new Contrast(20));		
		
		return f;	
	}

}

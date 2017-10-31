
public abstract class FilterOp {
	private FilterOp nextOp;
	
	public FilterOp nextOp(FilterOp o) {
		nextOp = o;
		return o;
	}
	
	public void apply(Imagem img) throws FilterError {
		op(img);
		nextOp.apply(img);
	}
	
	public abstract void op(Imagem i) throws FilterError;
}

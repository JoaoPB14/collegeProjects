	
public class Series {

	private int i1;
	private int i2;
	private int passo;
	
	Series () {
		this.i1 = 0;
		this.i2 = 0;
		this.passo = 1;
	}
	public void setI1 (int i1) {
		this.i1 = i1;
	}
	public void setI2 (int i2) {
		this.i2 = i2;
	}
	public void setPasso (int passo) {
		if (passo > 0)
			this.passo = passo;
		else
			this.passo=1;
	}
	public String mostraSerie() {
		int i;
		String r = "";
		if (this.i2 > this.i1) {
			for (i = this.i1 ; i <= this.i2 ; i += this.passo) {
				r += i+";" ;
			}
		} else {
			for (i = this.i1 ; i >= this.i2 ; i -= this.passo) {
				r += i+";" ;
			}
		}
		r = r.substring(0, r.length()-1);
		return r ;
	}
}

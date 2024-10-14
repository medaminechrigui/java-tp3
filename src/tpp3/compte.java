package tpp3;

public class compte {
	private int numc;
	private pers titc;
	private double sold;
	private int decmax;
	private int debitmax;
	static int n;
	public int getNumc() {
		return numc;
	}
	public void setNumc(int numc) {
		this.numc = numc;
	}
	public pers getTitc() {
		return titc;
	}
	public void setTitc(pers titc) {
		this.titc = titc;
	}
	public double getSold() {
		return sold;
	}
	public void setSold(double sold) {
		this.sold = sold;
	}
	public int getDecmax() {
		return decmax;
	}
	public void setDecmax(int decmax) {
		this.decmax = decmax;
	}
	public int getDebitmax() {
		return debitmax;
	}
	public void setDebitmax(int debitmax) {
		this.debitmax = debitmax;
	}
	public compte (pers p) {
		n++;
		numc=n;
		titc=p;
	}
	public compte (pers p, int dm,int dmax) {
		numc=n;
		n++;
		titc=p;
		debitmax=dm;
		decmax=dmax;
	}
	@Override
	public String toString() {
		return "compte [numc=" + numc + ", titc=" + titc + ", sold=" + sold + ", decmax=" + decmax + ", debitmax="
				+ debitmax + "]";
	}
	void crediter(double s) {
		if (s>0) {
			sold=sold+s;
		}
	}
	public boolean debiter(double s) {
		if (s<=debitmax && (sold-s)>decmax) {
			sold=sold-s;
			return true;
		}
		else {
			return false;
		}
	}
	void virement(compte c,double s) {
		if (this.debiter(s)) {
			c.crediter(s);
		}
	}
	static void virement(compte c1,compte c2,double s) {
		if (c1.debiter(s)) {
			c2.crediter(s);
		}
	}
	
}

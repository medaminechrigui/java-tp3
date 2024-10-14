package tpp3;

public class pers {
	private int n;
	private String nom;
	private String prenom;
	private String adr;
	private compte t[]=new compte[n];
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public compte[] getT() {
		return t;
	}
	public void setT(compte[] t) {
		this.t = t;
	}
	public pers(String pr,String nm,String a) {
		nom=nm;
		prenom=pr;
		adr=a;
	}
}

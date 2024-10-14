package tpp3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pers p=new pers("mohamed amine","chrigui","soliman");
		pers p2=new pers(" amine","azerty","soliman");
		compte c1=new compte(p,800,-2000);
		compte c2=new compte(p2,800,-2000);
		c1.crediter(9000);
		c2.debiter(1000);
		System.out.println(c1);
		System.out.println(c2);
		compte.virement(c1,c2,100);
	}

}

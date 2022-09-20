
public class Students {
	
	String variable1;
	int variable2;
	String variable3;
	  
	Students (int Teddy){
     variable2 = Teddy;

}
	Students(String doll){
		variable1 = doll;
	}
	
	Students(String doll,String bear){
		variable1 = doll;
		variable3 = bear;
	}
	public static void main (String [] args) {
		Students s = new Students ("doll");
		System.out.println(s);
		System.out.println(s.variable1);
		
		Students s1 = new Students ("doll","bear");
		System.out.println(s1);
		System.out.println(s1.variable1);
		System.out.println(s1.variable3);
	}
}
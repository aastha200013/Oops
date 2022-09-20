 class Fibonacci {
	public static void main (String [] args) {
		int n=1,n1=2,n2,i,count = 10;
		System.out.print(n+""+n1);
		
		for(i=2;i<count;++i)
		{
			n2=n+n1;
			System.out.print("" +n2);
			n=n1;
		    n1=n2;
		}
	}

}

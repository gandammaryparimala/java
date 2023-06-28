package parimala;


public class Factorcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int factors=0;
		
		System.out.println("factors of  given number are:");
		for(int i=1;i<=n;i++) {
if(n%i==0) {
factors++;
	System.out.println(":"+i);
}
	
}
		System.out.println("the number of factors"+factors);
		}

}

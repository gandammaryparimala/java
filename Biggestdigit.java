package parimala;



public class Biggestdigit {

	public static void main(String[] args) {
		int n=2459;
int max=0;
while(n>0) {
	int dig=n%10;
	max=Math.max(max, dig);
	n=n/10;
	
}
System.out.println("largest digit:"+max);
	}

}

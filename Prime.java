package parimala;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
System.out.println("enter prime numbers from 1 to100");
for(i=1;i<=10;i++) {
	
	for(j=2;j<=i;j++) {
		if(i%j==0) {
		
			break;
			
		}
	}
	if(i==j) {
		System.out.println(i);
	}
		
}
	}
}

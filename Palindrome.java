package parimala;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,reverse=0,temp;
int n=6556;

temp=n;
while(n>0) {
	i=n%10;
	reverse=(reverse*10)+i;
	n=n/10;
}
if(temp==reverse) {
	System.out.println("palindrome ");
	
		
	}
else {
	System.out.println("not palindrome");
}


	}

}

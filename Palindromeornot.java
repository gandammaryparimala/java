package parimala;

public class Palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=56652;
		int i,reverse=0,temp;
		temp=n;
		while(n>0) {
			i=n%10;
			reverse=(reverse*10);
			n=n/10;
		}
		if(temp==reverse) {
			System.out.println("palindrome");
		}
			else {
				System.out.println("not palindrome");
			}
			
		}

	}



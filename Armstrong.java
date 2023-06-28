package parimala;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=53;
		int tempnumber=number;
		int noofdigits=0;
		int remainder=0;
		int sum=0;
		while(tempnumber!=0) {
			remainder=tempnumber%10;
			remainder+=Math.pow(remainder, 3);
			tempnumber/=10;
			
			
		}
		if(remainder==number) {
			System.out.println(number+"is an armstrong");
		}
			else {
				System.out.println(number+"is not an armstrong");
			}
		}
			

	}



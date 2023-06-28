package parimala;
import java.util.scanner;
public class Repeatednum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
int digitcount[]=new int[10];
while(n!=0) {
	int digit= n%10;
digitcount[digit]++;
n=n%10;
}
int maxRepeateddigit=digitcount[0];
for(int i=0;i<digitcount.length;i++) {
	if(digitcount[i]>maxRepeateddigit) {
		maxRepeateddigit=i;
		
	}
}
System.out.println("the digit that repeated most:"+maxRepeateddigit);
	}

}

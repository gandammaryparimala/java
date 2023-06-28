package parimala;

public class Evenoddprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,flag=0;
int a[]= {1,2,5,6,3,2};
System.out.println("odd numbers");
for(int i=1;i<a.length;i++) {
	if(a[i]%2!=0) {
		System.out.println(a[i]);
	}
}
System.out.println("even number");
for(int i=1;i<a.length;i++) {
	if(a[i]%2==0) {
		System.out.println(a[i]);
	}
}
System.out.println("prime numbers");
for(int i=0;i<a.length;i++) {
	flag=0;
	for(j=2;j<a[i]/2;j++) {
		if(a[i]%j==0) {
		flag=1;
		System.out.println(a[i]);
		break;
	}
	
	
}
	System.out.println(a[i]+"-"+(flag==0?"prime":"not prime"));
}
	}
}
	



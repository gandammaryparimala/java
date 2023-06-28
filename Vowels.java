package parimala;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vcount=0,ccount=0;
int diff=0;

String str="This is a really simple sentence";
str=str.toLowerCase();
for(int i=0; i<str.length();i++) {
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		vcount++;
	}
	else 
		ccount++;
	
		
	
	if (vcount>ccount)
		diff=vcount-ccount;
	else 
		diff=ccount-vcount;
	
	
	
}


System.out.println("number of vowels:"+vcount);
System.out.println("number of constants:"+ccount);

System.out.println("difference:"+diff);
	}

}

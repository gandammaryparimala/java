package parimala;

public class StringEx {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello friends";
		System.out.println(str);

		int count=1; 
		int ln=str.length();
		for(int i=0;i<ln;i++) {
			if(str.charAt(i)== ' ') {
			count++;
			
			}
		}
		System.out.println("the string cointains "+count+" word.");
		}
		
	}
	

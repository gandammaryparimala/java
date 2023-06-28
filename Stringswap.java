package parimala;

public class Stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="parimala";

String lastLetter = ""+str.charAt(str.length()-1);
String remaining = str.substring(1,str.length()-1);
String firstLetter = ""+str.charAt(0);
String swapped = lastLetter+remaining+firstLetter;
System.out.println(swapped);
	}

}

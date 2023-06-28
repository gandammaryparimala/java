package parimala;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3456;
		String str = ""+n;
		String lastDigit = ""+str.charAt(str.length()-1);
		String remaining = str.substring(1,str.length()-1);
		String firstDigit = ""+str.charAt(0);
		String swapped = lastDigit+remaining+firstDigit;
		n = Integer.parseInt(swapped);
		System.out.println(n);

	}

}

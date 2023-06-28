package parimala;

public class Countall {
private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String test="huhhgyg554146*$%#&words";
countall(test);

	}
	public static void countall(String x) {
		char[] ch=x.toCharArray();
		int digits=0;
		int word=0;
		int symbols=0;
		int alphabets=0;
		for(int i=0;i<x.length();i++) {
			if(Character.isDigit(ch[i])) {
				digits++;
			}
			else if(Character.isAlphabetic(ch[i])) {
				alphabets++;
			}
			else if(Character.isWhitespace(ch[i])) {
				word++;
			}
			else  {
				symbols++;
			}
		}
		System.out.println("the string is:huhhgyg554146*$%#&words");
		System.out.println("Letters: "+ x.length());
		System.out.println("word: "+ word);
		System.out.println("symbols: "+ symbols);
		System.out.println("Alphabets: "+ alphabets);
	}

}

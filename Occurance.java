package parimala;

public class Occurance {
	static final int MAX_CHAR=253;
	static void getOccuringChar(String str) {
		int count[]=new int[MAX_CHAR];
		int len=str.length();
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
			char ch[]=new char[str.length()];
			 {
				ch[i]=str.charAt(i);
				int find=0;
				for(int j=0;j<len;j++) {
					if(str.charAt(i)==ch[j]) {
						find++;
					}
				}
				if(find==1) {
					System.out.println("the occurance of "+str.charAt(i)+" is: "+count[str.charAt(i)]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hai";
		getOccuringChar(str);

	}

}

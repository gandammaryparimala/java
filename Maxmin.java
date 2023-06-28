package parimala;

public class Maxmin {
	public int max(int[] array) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	public int min(int[] array) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarray={23,92,56,39,93};
		Maxmin m=new Maxmin();
		System.out.println("maximum value in the array is::"+m.max(myarray));
		System.out.println("minimum value in the array is::"+m.min(myarray));
	}
}

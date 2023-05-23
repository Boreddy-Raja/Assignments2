package ineuronAssesment2;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,30,30,40,40,2,4,10,30,10,60,2,2,45,67,23};
		//int[] a= {10,10,10,10,10,10,10,10};
		int[] b = new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				boolean in=searchCompleted(b,a[i]);
				if(a[i]==a[j] && in==false) {
					System.out.print(a[i]+" ");
					b[i]=a[i];
				}
			}
		}
		
		
	}
	static boolean searchCompleted(int[] b,int a) {
		boolean res=false;
		for(int i=0;i<b.length;i++) {
			if(a==b[i]) {
				res=true;
				break;
			}
		}
		return res;
	}

}

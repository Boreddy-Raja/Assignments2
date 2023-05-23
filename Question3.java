package ineuronAssesment2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {80,70,60,50,40,1,2};
		System.out.println("Input Array");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Output Array as sorted");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
	}

}

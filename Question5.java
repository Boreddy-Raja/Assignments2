package ineuronAssesment2;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {80,70,60,50,40,1,2};
		System.out.println("Input Array");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println();
		System.out.println("Output Array as sorted");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
	}

}

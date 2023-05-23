package ineuronAssesment2;


class Quick{
	void quicksort(int a[],int left,int right) {
		
		if(left<right) {
		int res = partition(a,left,right);
		quicksort(a,left,res-1);
		quicksort(a,res+1,right);
		}
		
	}
	int partition(int a[],int left,int right) {
		int pivot=right;
		while(left!=right) {
			if(a[right]==a[pivot]) {
				if(a[left]>a[pivot]) {
					int temp=a[pivot];
					a[pivot]=a[left];
					a[left]=temp;
					pivot=left;
				}
				else {
					left++;
				}
			}
			else if(a[left]==a[pivot]) {
				if(a[right]<a[pivot]) {
					int temp=a[pivot];
					a[pivot]=a[right];
					a[right]=temp;
					pivot=right;
				}
				else {
					right--;
				}
			}
			
		}
		
		return pivot;
		
	}
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Quick Start Implementation
		//consider pivot as last index
		
		int[] a= {80,70,60,50,40,1,2};
		System.out.println("Input Array");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		Quick quickobj = new Quick();
		quickobj.quicksort(a,0,a.length-1);
		System.out.println();
		System.out.println("Output Array as sorted");
		for(int ele:a) {
			System.out.print(ele+" ");
		}

	}
}



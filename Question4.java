package ineuronAssesment2;


class Mergesort{
	void merge(int[] a,int left,int mid,int right) {
		//System.out.println(left+""+right+""+mid);
		int lsize = mid-left+1;
		int rsize = right-mid;
		int L[] = new int[lsize];
		int R[] = new int[rsize];
		for(int i=0;i<lsize;i++) 
			L[i]=a[left+i];
		for(int j=0;j<rsize;j++)
			R[j]=a[mid+1+j];
		int i = 0, j = 0;
		 
        int k = left;
        while (i < lsize && j < rsize) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < lsize) {
            a[k] = L[i];
            i++;
            k++;
        }
 
        while (j < rsize) {
            a[k] = R[j];
            j++;
            k++;
        }
	}
	void sort(int[] a,int left,int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			sort(a,left,mid);
			sort(a,mid+1,right);
			merge(a,left,mid,right);
		}
	}
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {80,70,60,50,40,1,2};
		System.out.println("Input Array");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		Mergesort obj = new Mergesort();
		obj.sort(a,0,a.length-1);
		System.out.println();
		System.out.println("Output Array as sorted");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
	}

}

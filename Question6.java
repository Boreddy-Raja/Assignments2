package ineuronAssesment2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array A: ");
		int Asize= scan.nextInt();
		System.out.println("Enter size of Array B: ");
		int Bsize= scan.nextInt();
		int[] a= new int[Asize];
		int[] b= new int[Bsize];
		System.out.println("Enter Array A");
		for(int i=0;i<Asize;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter Array B");
		for(int i=0;i<Bsize;i++) {
			b[i]=scan.nextInt();
		}
		int i,j,k;
		for(i=0;i<=a.length-b.length;i++) {
			for(j=0,k=i;j<b.length;j++,k++) {
				if(a[k]!=b[j]) {
					break;
				}
			}
			if(j==b.length) {
				System.out.println("B is subArray of A");
				break;
			}
		}
		if(i==a.length-b.length+1) {
			System.out.println("B is NOT subArray of A");
		}
	}

}

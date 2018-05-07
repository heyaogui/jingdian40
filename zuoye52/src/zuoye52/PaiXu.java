package zuoye52;

import java.util.Scanner;

public class PaiXu {

	public static void main(String[] args) {
		System.out.println("请输入:");
		Scanner scanner =new Scanner(System.in);
		int count=scanner.nextInt();
		int[] array=new int[7];
		for(int a=0; a<array.length-1;a++) {
			for(int b=0;b<array.length-1;b++) {
				if(array[b]>array[b+1]) {
					int temp=array[b];
					array[b]=array[b+1];
					array[b+1]=temp;
				}
				
			}
		}
		System.out.println(array[0]+""+array[7]);
	}
	}



package jingdian40;

import java.util.Scanner;

public class TuZi {

	public static void main(String[] args) {
		System.out.println("请输入一个月份:");
		Scanner scanner =new Scanner(System.in);
		int count=scanner.nextInt();
		long sum;
		long s1=1;
		long s2=2;
		for(int month=1;month<=count;month++) {//count总数
			if(month==1) {
				System.out.println("第"+month+"个月有"+s1+"对兔子");
				continue;
		}else if(month==2) {
			System.out.println("第"+month+"个月有"+s2+"对兔子");
		}else {
			sum=s2;
			s2=s1+s2;
			s1=sum;
			System.out.println("第"+month+"个月有"+s2+"对兔子");
		}
	    }
	
	}
	
	}
	

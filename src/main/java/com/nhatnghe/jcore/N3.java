package com.nhatnghe.jcore;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		// đọc số có 3 chữ số
		Scanner x = new Scanner(System.in);
		System.out.print(">> số có 3 chứ số ví dụ(123): ");
		
		int n = x.nextInt();
		 
		// tách các chữ số
		int dv = n % 10;
		n /= 10;
		int chuc = n % 10;
		int tram = n / 10;
		
		// xuất đơn vị và trăm
		System.out.printf("Hàng đơn vị: %d \n", dv);
		System.out.printf("Hàng trăm: %d \n", tram);
		System.out.printf("Hàng chuc: %d \n", chuc);
		
		// xuất tổng
		System.out.printf("Tổng các chữ số là: %d\n",(tram+chuc+dv));
		
		// xuất ngược
		int t = dv;
		t =t*10+chuc;
		t=t*10+tram;
		System.out.printf("Số đảo ngược là: %d",t);
		
	}

}

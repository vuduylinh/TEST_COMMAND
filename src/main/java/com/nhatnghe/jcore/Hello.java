package com.nhatnghe.jcore;

import java.util.Scanner;

public class Hello {
		public static void main(String[] args) {
			// hello();
			nhap();
		}
		private static void nhap() {
			// TODO Auto-generated method stub
			Scanner x = new Scanner(System.in);
			
			System.out.print(">>> họ và tên: ");
			String fullname = x.nextLine();
			
			System.out.print(">>> lương: ");
			double salary = x.nextDouble();
			
			System.out.print(">>> Tuổi: ");
			int age = x.nextInt();
			System.out.println("\n");
			
			System.out.println("|   TÊN   ||   LƯƠNG   ||   TUỔI   |");
			System.out.printf("%s , %f , %d", fullname, salary,age);
			
		}
		private static void hello() {
			// TODO Auto-generated method stub
			System.out.println("nhất");
			System.out.println("nghệ");
			
			
			String s ="Nhất Nghệ";
			int d = 11;
			System.out.printf("%s hoạt động trên %d năm",s,d);
		}
}

package com.nhatnghe.jcore;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		demo2();
	}

	private static void demo2() {
		// TODO Auto-generated method stub
		String s1 ="123.456";
		String s2 ="123";
		String s3 = "true";
		
		double q = Double.parseDouble(s1);
		int w = Integer.parseInt(s2);
		boolean e = Boolean.parseBoolean(s3);
		
		System.out.printf("Q= %.2f| W= %d| E= %b",q,w,e);
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		double n = 5.7;
		
		double x = Math.sqrt(n); // căn bậc 2
		double y = Math.round(n); // làm còn số n
		double z = Math.pow(n, 3); // lũy thừa 3 của số n
		double w = Math.random(); // xuất số ngẫu nhiên n
		double a = Math.floor(n); // chọn số trên (chọn số dưới Math.floor) n 
		
		System.out.println("SỐ CỦA N:"+ n);
		System.out.println(">>X= " + x);
		System.out.println(">>Y= " + y);
		System.out.println(">>Z= " + z);
		System.out.println(">>W= " + w);
		System.out.println(">>A= " + a);
		
		
	}

}

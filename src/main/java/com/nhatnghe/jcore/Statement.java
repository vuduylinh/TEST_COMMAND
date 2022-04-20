package com.nhatnghe.jcore;

import java.util.Scanner;
import java.io.*;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//ptb2();
		//	daysInMonth();
	//	Numbers();
			Check();
	}

	private static void Check() {
		// TODO Auto-generated method stub
		boolean chk = false;
		//int n=0;
		Scanner x = new Scanner(System.in);
	//	while(chk==false) {
		while(true) {
		try {
			
			System.out.println("nhap vao so N");
			int n =x.nextInt();
			System.out.println("So vua nhap nhap: "+n);
			//chk = true;
			break;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vui long nhap vao so nguyen!");
			 x.nextLine();
		}
	}
	}

	private static void Numbers() {
		// TODO Auto-generated method stub
		int n = 1234567, tong =0, dem=0 , sdn=0;
		// xuat tat ca chu so n ra man hinh bat dau tu hang don vi
		while(n>0) {
			int x = n%10;
			System.out.print(x);
			
			tong = tong + x;
			
			
//			if(x%2 ==1) {
//				dem ++;
//			}
//			// so dao nguoc cua n
//			sdn =sdn*10+x;
			
		}
		// xuat tong cac chu so
		System.out.println("Tong: "+ tong);
//		// xuat tong cac chu so le
//		System.out.println("Tong cac chu so le:"+dem);
//		//xuat dao nguoc cua n
//		System.out.println("So dao nguoc:"+sdn);
		
		
//		// xuat cac so uoc cua m
//				int m=123456, i=1 , tong2=0;
//				boolean isSNT = true;
//				
//		System.out.println("Cac uoc cua so M:"+m);
//		while(i<m/2) {
//			if(m%i==0) {
//				System.out.println(i);
//				tong2=tong2+i;
//				isSNT = false;
//			}
//			i++;
//		}
//		if(tong2 == m) {
//			System.out.println(m+"la so hoan thien");
//		}
//		else {
//			System.out.println(m+"khong phai so hoan thien");
//		}
//		// kiem tra n co phai la so nguyen to khong
//		if(isSNT) {
//			System.out.println(m+"la so nguyen to");
//		}
//		else {
//			System.out.println(m+"khong phai la so nguyen to");
//		}
	}

	private static void daysInMonth() {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		int month;
		System.out.print("nhap so thang: ");
		month = x.nextInt();
		
		int year = 2019;
		switch (month) {
		case 2:
			int days =(year % 4 == 0 && year % 100 !=0 )? 29:28;
			System.out.printf("So nay cua thang 2/%d la %d",year,days);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("so ngay cua thang %d/%d la 30",month,year);
			break;
		default:
			System.out.printf("so ngay cua thang %d/%d la 31",month,year);
			break;
		}
		
	}

	private static void ptb2() {
		// TODO Auto-generated method stub
		double a=3,b=7 , c=-4;
		
		double delta = Math.pow(b,2)-4*a*c;
		if(delta < 0 ){
			System.out.println("Vo nghiep");
		}
		else if (delta ==0) {
			double x1 = -b/(2*a);
			System.out.println("phuong trinh nghiem kep: " + x1);
		}
		else {
			double x2=(-b+Math.sqrt(delta))/(2*a);
			double x3=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("2 nghiep phan biet");
			System.out.println(">>X2: "+x2);
			System.out.println(">>x3: "+x3);
			
		}
	}

}

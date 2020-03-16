package com.bof.findchar.main;

import java.util.Scanner;

import com.bof.findchar.FindChar;

public class Main {
	public static void main(String[] args) {
		System.out.println("Moi nhap vao xau ky tu: ");
		Scanner sc = new Scanner(System.in);

	FindChar test = new FindChar(sc.nextLine());
	//test.countWord();
	test.timKyTuXuatHienMotLan();
	test.timKyTuXuatHienMotLan();
	test.timKyTuXuatHienNhieuNhat();

	
	}
}

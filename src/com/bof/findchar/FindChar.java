package com.bof.findchar;

import java.util.Scanner;

public class FindChar {
	private String text;

	public FindChar(String text) {
		this.text = text;
	}

	public void countWord() {
		String tmp = text.trim();
		if (tmp.isEmpty()) {
			System.out.println("Chuoi rong");
			return;
		}
		int count = 1;
		for (int i = 0; i < tmp.length() - 1; i++) {
			if (tmp.charAt(i) != ' ' && tmp.charAt(i + 1) == ' ') {
				count++;
			}
		}
		System.out.println("So tu cua xau la: " + count);
	}

	public void timKyTuXuatHienMotLan() {
		String tmp = text.replace(" ", "");
		if (tmp.isEmpty()) {
			System.out.println("Chuoi rong");
			return;
		}
		while (tmp.length() > 0) {
			int length1 = tmp.length();
			char kyTu = tmp.charAt(0);
			tmp = tmp.replace(kyTu + "", "");
			int length2 = tmp.length();
			
			if (length1- length2 == 1) {
				System.out.println("Chu cai: " +kyTu + " xuat hien mot lan.");
			}
		}
	}

	public void timKyTuXuatHienHaiLan() {
		String tmp = text.replace(" ", "");
		if (tmp.isEmpty()) {
			System.out.println("Chuoi rong");
			return;
		}
		while (tmp.length() > 0) {
			int length1 = tmp.length();
			char kyTu = tmp.charAt(0);
			tmp = tmp.replace(kyTu + "", "");
			int length2 = tmp.length();
			
			if (length1- length2 == 2) {
				System.out.println("Chu cai: " +kyTu + " xuat hien hai lan.");
			}
		}
	}

	public void timKyTuXuatHienNhieuNhat() {
		String tmp = text.replace(" ", "");
		if (tmp.isEmpty()) {
			System.out.println("Chuoi rong");
			return;
		}
		String kq = "";
		int max = 0;
		while (tmp.length() > 0) {
			int length1 = tmp.length();
			char kyTu = tmp.charAt(0);
			tmp = tmp.replace(kyTu + "", "");
			int length2 = tmp.length();

			if (length1 - length2 > max) {
				max = length1 - length2;
				kq = kyTu + "";
			} else if (length1 - length2 == max) {
				kq = kq + " ," + kyTu;
			}
		}
		System.out.println("Chu cai xuat hien nhieu nhat la: " + kq + " voi " + max + " lan xuat hien.");
	}
}

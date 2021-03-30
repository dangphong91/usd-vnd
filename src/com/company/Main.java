package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        int usd = scanner.nextInt();
        int vnd = usd*rate;
        System.out.println("Số tiền VNĐ là: " + vnd);
    }
}

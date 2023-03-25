package basic.dev;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiDoiXung {
	public static void main(String[]args) {
		//su dung stack de kiem tra chuoi doi xung
		System.out.println("nhap vao chuoi muon kiem tra:");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		Stack stack = new Stack();
		for (int i = 0; i < inputString.length(); i++) {
			
			stack.push(inputString.charAt(i));
		}
		String reverseString ="";
		while (!stack.isEmpty()) {
			reverseString = reverseString+stack.pop();
		}
		if (inputString.equals(reverseString ))
			System.out.println("Day la chuoi doi xung. ");
		else
			System.out.println("Day khong phai la chuoi doi xung. ");
		
		
		
		
	}

}


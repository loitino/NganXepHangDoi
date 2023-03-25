package basic.dev;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanNhiPhan {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			Stack<Integer> stack = new Stack<Integer>();
			System.out.println("Nhập vào số thập phân: ");
			int num = sc.nextInt();
			while (num != 0) {
				int d = num % 2;
				stack.push(d);
				num /= 2;
			}
			System.out.println("Gias trị nhị phân là :");
			while (!(stack.isEmpty() ))
			{
			System.out.println(stack.pop());	
			}
			System.out.println();
			System.out.println("-------------------------");
		}
	}
}
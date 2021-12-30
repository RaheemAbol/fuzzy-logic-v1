package co.perscholas.webinar;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");		
		int no1 = sc.nextInt();
		System.out.print("Enter second number:");		
		int no2 = sc.nextInt();
		System.out.println("enter required operation[+,-,*,/]: ");
		char operator = sc.next().charAt(0);
		
		int res = calculate(no1,no2,operator);
		System.out.println(res);
		sc.close();

	}
	// method to perform operations
	static int calculate(int x, int y, char operator) {
		int res=0;
		switch(operator) 
		{
		case '+':
			res=x+y;
			break;
		case '-':
			res=x-y;
			break;
		case '*':
			res=x*y;
			break;
		case '/':
			res=x/y;
			break;
		}
		return res;
	}
}

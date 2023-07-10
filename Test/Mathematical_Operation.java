package Test;

import java.util.Scanner;

public class Mathematical_Operation extends Calculation {

public int mul(int g,int h) {
		
		int j=g*h;
		return j;		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int add=sc.nextInt();
		Mathematical_Operation mo=new  Mathematical_Operation();
		Calculation c=new Calculation();
	    System.out.println("Please Give Two Number for addition"+add);
		System.out.println("Addition="+add);
	    int sub=c.sub(20, 10);
		System.out.println("Subtraction="+sub);
		int mul=mo.mul(10, 20);
		System.out.println("Multiplication="+mul);
        int div=c.div(25, 5);
        System.out.println("Division="+div);
	}

}

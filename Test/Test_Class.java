package Test;

public class Test_Class {

	public static void main(String[] args) {
        int n=0;
		switch (n) {
		case 5:
			System.out.println("This case is passed and output is 5");
		case 10:
			System.out.println("This case is passed and output is 10");
		case 60:
			System.out.println("This case is passed and output is 60");
		default:
			System.out.println("This case is executed at last");
		
		}
		
		String s="premnath";
		switch (s) {
		case "premnath":
			System.out.println("This case is passed and output is premnath");
			break;
		case "suryawanshi":
			System.out.println("This case is passed and output is suryawanshi");
		case "25":
			System.out.println("This case is passed and output is age 25");
		case "omerga":
			System.out.println("This case is passed and output is omerga villege");
		default:
			System.out.println("This case is executed at last");
		}
		
		int no=0;
		while(no<5) {
			System.out.println("My name is premnath"+no);
			no++;
			
		}
		
		//Print 1 to 10 numbers
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		// Print odd number from 1 to 10
		for(int i=0; i<=10; i++) {
		
			if(i%2==0) {
				System.out.println(i);
			}
		}

	 //  odd and even number
	  int num=10;
	  if (num%2==0) {
		  System.out.println("Number is even");
	  }else {
		  System.out.println("Number is odd");
	  }
	

	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
		System.out.print("*");
		}
		System.out.println();
	}
	
	

}
}
package Test;

public class Method_Overloading extends Mo {
	
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void sum(int a,int b,int d) {
		int c=a+b+d;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overloading mo=new Method_Overloading();
		mo.sum(10, 20);
		mo.sum(10, 20, 30);
		mo.uan("Method 1");
		mo.uan("m1", "m2");

	}

}

package Test;

public class Cars {

	String modelno="xuv";
	int prize=450000;
	static int wheels=4;
	public static void main(String[] args) {
		
		Cars c=new Cars();
		c.modelno="tata";
		c.prize=500000;
		Cars c1=new Cars();
		c1.modelno="mahindra";
		c1.prize=600000;
		c1.wheels=4;
		System.out.println(c1.modelno);
		System.out.println(c1.prize);
		System.out.println(c1.wheels);
	//	System.out.println(c);
	//	String d=c.modelno;
		

	}
}

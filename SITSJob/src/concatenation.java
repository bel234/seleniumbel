
public class concatenation {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		String x;
		x= "Hello";
		
		String y;
		y= "Java";
		
		/*String z;
		z= x + y;*/
			System.out.println(x + " " + y);
		
		int a;
		a = 10;
		int b;
		b= 49;
	System.out.println(a+b); //correct	
	System.out.println (a+b+x+y); //correct
	System.out.println(a+b+" "+x+y); //wrong
	System.out.println(x+y+a+b); //wrong
	System.out.println(x+" "+y+" "+a+b); //wrong
	System.out.println(a+b +" " +x+ " " +y); //correct
	System.out.println(x+ " " +y+ " " +(a+b)); //correct

	}

}

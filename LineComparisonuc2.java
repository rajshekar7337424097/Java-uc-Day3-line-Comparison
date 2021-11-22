public class LineComparisonuc2 {


	public static void main(String[] args) {
		//constant variable for 1st line
		int X1=10;
		int X2=7;
		int Y1=2;
		int Y2=6;

		// constant  variable for 2nd line
		int A11=10;
		int B11=2;
		int A22=7;
		int B22=6;
		// reusable variables
		int x=2;
		int y=2;
		// First line operation
		double a=Math.subtractExact(X2, X1);
		double b=Math.subtractExact(Y2,Y1);
		//Here c is double version of int aperand
		int c=(int)Math.pow(a, x);
		int d=(int)Math.pow(b, y);
		double e=Math.addExact(c, d);
		double f=Math.sqrt(e);

		// second line operation
		double a1=Math.subtractExact(A22, A11);
		double b1=Math.subtractExact(B22, B11);
		int c1=(int)Math.pow(a1, x);
		int d1=(int)Math.pow(b1, y);
		double e1=Math.addExact(c1, d1);
		double f1=Math.sqrt(e1);
		System.out.println(+f1);

		if (f == f1)
			System.out.println("Lines are equal");
		else
			System.out.println("Line are not equal");

		System.out.println("1st distance of line"+f);
		System.out.println("2st distance of line"+f1);


	}

}
